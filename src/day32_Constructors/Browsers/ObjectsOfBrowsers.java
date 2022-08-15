package day32_Constructors.Browsers;

public class ObjectsOfBrowsers {

    public static void main(String[] args) {

        Browsers browser1 = new Browsers("Google", "USA", 2.0, true,
                true, 4300000000L);
        Browsers browser2 = new Browsers("Chrome", "USA", 3.0, true,
                false, 2745000000L);
        Browsers browser3 = new Browsers("Opera", "Norway", 4.5, false,
                true, 1345000000L);
        Browsers browser4 = new Browsers("Safari", "USA",3.2, false,
                true, 1675000000L);

        System.out.println(browser1);
       browser1.name ="Firefox";
        System.out.println(browser1);

        browser3.origin = "Sweden";
        System.out.println(browser3);
    }
}
