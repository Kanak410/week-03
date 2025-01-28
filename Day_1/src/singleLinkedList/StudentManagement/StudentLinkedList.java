package singleLinkedList.StudentManagement;

public class StudentLinkedList {
    private StudentNode head;
    public void addAtBeginning(int rollNo,String name,int age, String grade){
        StudentNode newNode=new StudentNode(rollNo, name, age, grade);
        newNode.setNext(head);
        head=newNode;
    }

    // Add a student record at the end
    public void addAtEnd(int rollNo,String name,int age, String grade){
        StudentNode newNode=new StudentNode(rollNo, name, age, grade);
        if(head==null){
            head=newNode;
            return;
        }
        StudentNode temp=head;
        while(temp.getNext()!=null){
            temp=temp.getNext();
        }
        temp.setNext(newNode);

    }
    // Add a student record at a specific position
    public void addAtSpecific(int pos,int rollNo,String name,int age, String grade){
        if(pos==1){
          addAtBeginning(rollNo, name, age, grade);
          return;
        }

        StudentNode newNode=new StudentNode(rollNo, name, age, grade);
        StudentNode temp=head;
        for(int i=1;i<pos-1;i++){
            if(temp==null){
                System.out.println("position is not found in list");
                return;
            }
            temp=temp.getNext();
        }
        if(temp==null){
            System.out.println("position is not found in list");
            return;
        }
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
    }
    // Delete a student record by Roll Number
    public void deleteRoll(int rollNo){
        if(head==null){
            System.out.println("list is empty");
        }
        if(head.getRollNo()==rollNo){
            head=head.getNext();
            return;
        }
        StudentNode temp=head;
        while(temp.getNext()!=null && temp.getNext().getRollNo()!=rollNo){
            temp=temp.getNext();
        }
        if(temp.getNext()==null){
            System.out.println("record not found");
            return;
        }
        temp.setNext(temp.getNext().getNext());
    }


    // Search for a student record by Roll Number
    public String searchRoll(int rollNo){
        StudentNode temp=head;
        while(temp!=null){
            if(temp.getRollNo()==rollNo){
                return "Roll no: "+temp.getRollNo()+", name: "+temp.getName()+", Age: "+temp.getAge()+", Grade: "+temp.getGrade();
            }
            temp=temp.getNext();
        }
        return "record not found.";
    }
    // Display all student records
    public void display(){
        if(head==null){
            System.out.println("No record to display.");
            return;
        }
        StudentNode temp=head;
        while(temp!=null){
            System.out.println("Roll no: "+temp.getRollNo()+", name:"+temp.getName()+",Age:"+temp.getGrade());
            temp=temp.getNext();

            }
        }
    // Update a student's grade based on Roll Number
    public void updateGrade(int rollNo,String newGrade){
        StudentNode temp=head;
        while(temp!=null){
            if(temp.getRollNo()==rollNo){
                temp.setGrade(newGrade);
                System.out.println("Grade updated ");
                return;
            }
            temp=temp.getNext();
        }
        System.out.println("record not found");
    }




}
