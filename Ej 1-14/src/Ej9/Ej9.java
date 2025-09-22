package Ej9;


public class Ej9 {
    public static void main (String[]args){
        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
        var persona = new PersonaDos("Catalina", 2);
        persona.setNombre("Catalina Closter");
        persona.setEdad(22);
        System.out.println("Me llamo " + persona.getNombre() + " y tengo " + persona.getEdad() + " años");
        
        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
        var producto = new ProductoDos();
        producto.setPrecio(23000);
        System.out.println("El precio es de $" + producto.getPrecio());

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
        var cuentaBancaria = new CuentaDeBancoDos(1200000);
        System.out.println("Su balance es de: $ " + cuentaBancaria.getBalance());
        cuentaBancaria.deposito(2000000);
        cuentaBancaria.retiro(1300000);

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
        var libro = new LibroDos("La piel de la memoria");
        System.out.println("El libro se llama " + libro.getTitulo());

        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        var temperatura = new Temperatura();
        temperatura.setCelsius(17);
        System.out.println( "Hacen " + temperatura.getCelsius() + "°");

        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
        var usuario = new Usuario();
        usuario.setUsuario("EsElPeipper");
        usuario.setContraseña("11Tomalube44");
        System.out.println(usuario.checkContraseña("11Tomalube44"));

        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
        var empleado = new Empleado();
        empleado.setSalario(1200000);
        System.out.println(empleado.aumentoSalario(15));

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
        var rectangulo = new Rectangulo();
        rectangulo.setAltura(12);
        rectangulo.setAncho(8);
        System.out.println("El área del rectangulo es " + rectangulo.calcularArea());

        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
        var estudiante = new Estudiante();
        estudiante.setNota(8);
        System.out.println(estudiante.calificacion());

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
        var auto = new Auto();
        auto.setVelocidad(40);
        System.out.println(auto.acelerar(20));
        System.out.println(auto.acelerar(40));
        System.out.println(auto.frenar(80));
       

    }
}
