public class HomeWork5 {
    public static void main(String[] args) {
        Worker[] persArray = new Worker[5];
        persArray[0] = new Worker("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Worker("Petrov Petr", "Engineer", "petrov@mailbox.com", "899962048", 30000, 40);
        persArray[2] = new Worker("Voronov Kirill", "Accountant'", "kirvor@mailbox.com", "89649284", 25000, 30);
        persArray[3] = new Worker("Zaycev Maxim", "Analyst", "max.z@mailbox.com", "89008458", 30000, 45);
        persArray[4] = new Worker("Grachova Marina", "Manager", "grachova.marinochka@mailbox.com", "89990294", 25000, 25);

        for (int i = 0; i < persArray.length; i++){
            if (persArray[i].age > 40) {
                persArray[i].print();
            }
        }
    }
}

class Worker {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Worker (String name, String position, String email, String phone, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void print(){
        System.out.println("Name:" + this.name);
        System.out.println("Position: " + this.position);
        System.out.println("Email: " + this.email);
        System.out.println("Phone: " + this.phone);
        System.out.println("Salary: " + this.salary);
        System.out.println("Age: " + this.age);
    }
}