public class FindMaxMarkStudent{

    
public int weight[];

    public int marks[][];
 
    public int max[][];
   
 
   public FindMaxMarkStudent(){
 
       this.weight = new int[3];
   
       this.marks = new int[][] { {35,56,78} , {67,89,78} , {30,40,35} };
   
       this.max = new int[3][3];
   
    }	
    
    
    public void findMaxMark(int i,int j){
   
     if(i>=0 && i<3 && j>=0 && j<3){
  
          if((i+1)<3 && this.marks[i+1][j]>=this.marks[i][j]){
      
          this.max[i+1][j]=1;
  
              findMaxMark(i+1,j);
    
        }
            

            if((j+1)<3 && this.marks[i][j+1]>=this.marks[i][j]){
    
            this.max[i][j+1]=1;

                findMaxMark(i,j+1);

            }

        }

        return;

    }

 
    public static void main(String []args){
 
       FindMaxMarkStudent findMaxMarkStudent = new FindMaxMarkStudent();
 
       
findMaxMarkStudent.findMaxMark(0,0);
 
       for(int i=0;i<3;i++){
  
         for(int j=0;j<3;j++){ 
 
                System.out.print(findMaxMarkStudent.marks[i][j]+" ");  

           }  
 
           System.out.println();//new line  

        } 
      
       for(int i=0;i<3;i++){  
 
          for(int j=0;j<3;j++){  
     
           System.out.print(findMaxMarkStudent.max[i][j]+" ");  
  
          }  

          System.out.println();//new line  
 
       }  
   
  }

}