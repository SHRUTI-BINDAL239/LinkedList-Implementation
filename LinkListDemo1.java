import java.util.Scanner;
class LinkList{
	Scanner s1=new Scanner(System.in);
	Node start=null;
	int data;
	class Node{
       int data;
       Node link;
       Node(int data){
		   this.data=data;
		   this.link=null;
		}
	}
		public  void insertAtBegin(){
			System.out.println("enter the data");
			data=s1.nextInt();
			Node n1=new Node(data);
			if(start==null){
				n1.link=null;
				start=n1;
			}
			else
			{
				n1.link=start;
				start=n1;
			}
		}
		public void traverse(){
			Node temp;
			temp=start;
			while(temp!=null){
				System.out.println(temp.data);
				temp=temp.link;
			}
		}
		public void deleteAtBegin(){
			if(start==null){
				System.out.println("list is empty");
				return;
			}
			else{
				start=start.link;
			}
		}
		public void delAtEnd(){
			if(start==null){
				System.out.println("list is empty");
				return;
			}
			Node temp=start;
			Node p1=null;
		    while(temp.link!=null){
				p1=temp;
				temp=temp.link;
			 }
			    p1.link=null;
			}
			public void insertAtSpecPosi(){
				System.out.println("enter the position");
				int pos=s1.nextInt();
				System.out.println("enter the data");
				data=s1.nextInt();
				Node n1=new Node(data);
				Node temp=start;
				for(int i=1;i<pos-1;i++){
					temp=temp.link;
				}
				n1.link=temp.link;
				temp.link=n1;
			}
			public void insertAtEnd(){
				System.out.println("enter the data");
				data=s1.nextInt();
				Node n1=new Node(data);
				Node temp=start;
				while(temp.link!=null){
					temp=temp.link;
				}
				temp.link=n1;
				n1.link=null;
			}
			public void deleteAtSpecPosi(){
				System.out.println("enter the position");
				int pos=s1.nextInt();
				Node temp=start;
				Node p1=null;
				for(int i=1;i<=pos;i++){
					p1=temp;
					temp=temp.link;
				}
				p1.link=temp.link;
				
		    }		
	}	
	

	
	class LinkListDemo1{
		public static void main(String ar[]){
			int choice;
			Scanner s1=new Scanner(System.in);
			LinkList list=new LinkList();
			do{
				System.out.println("1. inert at beginning");
				System.out.println("2. traverse");
				System.out.println("3. delete at end");
				System.out.println("4. delete at beginning");
				System.out.println("5. delete at specific position");
				System.out.println("6. indert at specific position");
                System.out.println("7. insert at end");				
				System.out.println("8. exit");
				System.out.println("enter your choice");
				choice=s1.nextInt();
				switch(choice){
					case 1:
					    list.insertAtBegin();
					break;
					case 2:
					    list.traverse();
					break;
					case 3:
					    list.delAtEnd();
					break;
					case 4:
					    list.deleteAtBegin();
					break;
					case 5:
					   list.deleteAtSpecPosi();
					break;
					case 6:
					    list.insertAtSpecPosi();
					break;
					case 7:
				    	list.insertAtEnd();
					break;
					case 8:
					  System.exit(0);
					break;
					
				}
			}while(choice!=9);

		}
}	
