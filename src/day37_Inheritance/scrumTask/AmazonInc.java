package day37_Inheritance.scrumTask;

public class AmazonInc {

    public static void main(String[] args) {

        String company = "Amazon Inc";

        ProductOwner po = new ProductOwner("Ahmet", 29, 'M', "PO", 1,
                                           120000, company);

        BusinessAnalyst ba = new BusinessAnalyst("Cihad", 25, 'M', "ba",
                                            2, 130000, company);

        ScrumMaster sm = new ScrumMaster("Fatma", 22, 'F', "sm",
                5, 148000, company);

        Tester tester1 = new Tester("Ali", 22, 'M', "tester",
                                    7, 120000, company);

        Tester tester2 = new Tester("Ayse", 42, 'F', "tester",
                9, 120000, company);

        Tester tester3 = new Tester("Arif", 52, 'M', "tester",
                11, 120000, company);

        Tester tester4 = new Tester("Hatice", 33, 'F', "tester",
                19, 120000, company);

        Tester[] testers = {tester1, tester2, tester3, tester4};

        Developer developer1 = new Developer("Mehmet", 42, 'M', "Dev", 35,
                170000, company);

        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTester(testers);

        System.out.println(scrumTeam);

        for (Tester tester : scrumTeam.testers) {

            System.out.println(tester.name + " : " + tester.salary);
            
        }

        for (Developer developer : scrumTeam.developers) {

            System.out.println(developer.name + " is earning " + "$"+ developer.salary);

        }





    }
}
