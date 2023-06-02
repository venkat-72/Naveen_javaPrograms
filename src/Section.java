class Section extends Department{
    public void getDepartmentSize(){
        int size=200;
        System.out.println(size);
    }
public static void main(String[] args){
    Section s=new Section();
    s.getDepartmentSize();
}

}
