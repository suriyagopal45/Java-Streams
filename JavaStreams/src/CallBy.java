class User
{
    int age;
    String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}


public class CallBy {
    static void main() {

        User suriya = new User(23,"Suriya");

        func(suriya);

        String address = "Chennai";

        changeAddress(address);

        System.out.println(address);

        System.out.println(suriya.getAge());


        StringBuffer string = new StringBuffer("Suraiyaaa");

        for(int i=0;i<string.length();i++)
        {
            string.setCharAt(i,Character.toLowerCase(string.charAt(i)));
        }
        System.out.println(string);

        string.deleteCharAt(string.indexOf("a"));

        System.out.println(string);

        String a = "Suriya";

        String b  = "riya";

        String c = a.substring(2);

        System.out.println(b==c);

        int sum = a.charAt(0);
        System.out.println(sum);

        String d = "";
        d+=c.charAt(0);
        d+=c.charAt(2);
        System.out.println(d);
        


    }

    private static void changeAddress(String address) {
        address = "Mumbai";
    }

    private static void func(User suriya) {
        suriya = new User(21,"Sai");
        suriya.setAge(21);

    }
}
