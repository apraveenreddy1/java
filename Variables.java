//Variables: local, instance, static 
class Variables{

    int j = 20; //instance variable
    static int z = 30; //static variable

    public static void main(String args[]){
        
        //local variable
        int i = 10; 
        System.out.println("local "+i);

        //instance variable
        Variables var = new Variables(); 
        System.out.println("instance "+var.j);

        //static variable
        System.out.println("static "+var.z);
    }
}