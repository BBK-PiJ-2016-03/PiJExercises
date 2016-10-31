import java.lang.reflect.*;

public class App{
    public static void main(String[] args){
        //SmartPhone myPhone = new SmartPhone();
        
        Mobilephone myPhone = new Smartphone();

        myPhone.browseWeb("www.google.com");
        System.out.println(myPhone.findPosition());
        myPhone.playGame("Snake");
        myPhone.call("01708731555");


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

}