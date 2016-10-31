//import java.lang.reflect.*;

public class App{
    public static void main(String[] args){

        App app = new App();

        SmartPhone myPhone = new SmartPhone();
        
        //Mobilephone myPhone = new Smartphone();

        app.testPhone(myPhone);


        /*
        
        Method[] methods = SmartPhone.class.getDeclaredMethods();

        for(Method method : methods){

            if(!method.isAccessible())
                method.setAccessible(true);

            System.out.println(method.getName());

            Object[] params = method.getGenericParameterTypes();
            
            if(params.length == 0){
                try{
                    //System.out.println(method.invoke(myPhone));
                    method.invoke(new SmartPhone());
                }
                catch(IllegalAccessException e){

                }
            }
            
        }

        */
    }

    private void testPhone(Phone phone){
        SmartPhone smartPhone = (SmartPhone)phone;
        smartPhone.browseWeb("www.google.com");
        System.out.println(smartPhone.findPosition());
        smartPhone.playGame("Snake");
        smartPhone.call("01708731555");
    }

}