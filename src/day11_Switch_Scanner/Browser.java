package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {

        String browserName = "firefox";

        String result = "";

        boolean validBrowser = browserName == "chrome" || browserName == "firefox" ||
                browserName == "opera" || browserName == "safari" ||
                browserName == "edge";

        if (validBrowser) {

            if (browserName == "chrome") {

                result = "Chrome Browser is selected";
            } else if (browserName == "firefox") {
                result = "Firefox Browser is selected";
            } else if (browserName == "opera") {
                result = "Opera Browser is selected";
            } else if (browserName == "safari") {
                result = "Safari Browser is selected";
            } else {
                result = "Edge Browser is selected";
            }


            }else{
                result = "Invalid Browser Name";
            }
        System.out.println("result = " + result);


        }
    }

