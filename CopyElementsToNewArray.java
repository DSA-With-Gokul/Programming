import java.util.Arrays;

public class CopyElementsToNewArray {
    public static void main(String[] args) {
        int[] originalArray = {1,2,3,4,5};
        
        //! Method 1
        // Using a loop to copy elements one by one.
        // When you need conditions or transformations while copying.
        int[] LoopCopy = new int[originalArray.length];

        for(int i=0; i<originalArray.length; i++){
            LoopCopy[i] = originalArray[i];
        }
        System.out.println(Arrays.toString(LoopCopy));

        //! Method 2
        // Using System.arraycopy().
        // Fast copying between arrays or copying only part of an array.
        int[] ArrayCopy = new int[originalArray.length];

        System.arraycopy(originalArray,0,ArrayCopy,0,originalArray.length);
        System.out.println(Arrays.toString(ArrayCopy));

        //! Method 3
        // Using Arrays.copyOf()
        // Simple full copy or creating a resized array.
        int[] ArrayCopyOf = Arrays.copyOf(originalArray,originalArray.length);

        System.out.println(Arrays.toString(ArrayCopyOf));
        
        //! Method 4
        // Using clone() {originalArray.clone()}.
        // Quick copy of the entire array.
        int[] CloneCopy  = originalArray.clone();

        System.out.println(Arrays.toString(CloneCopy));
    }

}
