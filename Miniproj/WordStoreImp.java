
public class WordStoreImp implements WordStore
{
    String [] theArray;
    int totalarray_size;
    int actualarray_size;

    public WordStoreImp(int l){

        actualarray_size=0;
        totalarray_size=l;
        theArray=new String[l];

    }

    public void add(String word){
        theArray[actualarray_size]=word;
        actualarray_size++;
    }

    public int count(String word){
        int counter=0;
        for(int index=0;index<theArray.length;index++){
            if(word.equals(theArray[index])){
                counter++;
            }
        }
        return counter;
    }

    public void remove(String word){
        int index=0;
        int i=0;
        String[] matarray=new String[theArray.length-1];
        for(;i<actualarray_size;i++){
            if(word.equals(theArray[i])){
                index=i;
            }
        }
        i=0;

        for(;i<theArray.length;i++){
            if(i>matarray.length)
            {
                break;
            }

            if(i==index){

            }

            else{

                matarray[i]=theArray[i];

            }

        }

        theArray=new String[matarray.length];

        int j=0;

         for(;j<actualarray_size;j++){
            theArray[j]=matarray[j];
        }

    }

}