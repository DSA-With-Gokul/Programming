class RemoveElement{
    public static void main(String[] args) {
        int[] orignalArray = {1,2,3,4,5};
        int indexToRemove = 2;
        int[] newArray = new int[orignalArray.length-1];
        
        // copy elements before the index.
        System.arraycopy(orignalArray,0,newArray,0,indexToRemove);

        // copy elements after the index. 
        System.arraycopy(orignalArray,indexToRemove+1,newArray,indexToRemove,orignalArray.length-indexToRemove-1);

        // newArray contains [1,2,3,4]
    }
}
