public class Teacher extends Human {
    private String item;
    public void setItem(String item){
        this.item=item;
    }
    public String getItem(){
        return item;
    }
    public Teacher(String item,String name){
            super(name);
            this.item=item;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + getName());
    }
}
