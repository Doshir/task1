public class Student extends Human{
    private String studyGroup;

     String getStudyGroup(){
        return studyGroup;
    }
     void setStudyGroup(String studyGroup){
        this.studyGroup=studyGroup;
    }
    public Student(String studyGroup,String name){
         super(name);
         this.studyGroup=studyGroup;

    }
}
