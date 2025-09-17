package Ej11;

public class Notification {
    // 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
    public void send(){
        System.out.println("Te llego una notificacion");
    }

     public void sendNotification(Notification n){
        n.send();
    }
}
