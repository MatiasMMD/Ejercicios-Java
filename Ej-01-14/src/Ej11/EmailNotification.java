package Ej11;

public class EmailNotification extends Notification{
    // 6. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
    @Override
    public void send(){
        System.out.println("Te llego una notificacion del e-mail");
    }

}
