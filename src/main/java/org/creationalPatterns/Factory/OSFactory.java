package org.creationalPatterns.Factory;

public class OSFactory {
    public OS getOS(String choice){
        if(choice.equals("Android")){
            return new Android();
        } else if (choice.equals("IOS")) {
            return new IOS();
        } else  {
            return new Windows();
        }
    }
}
