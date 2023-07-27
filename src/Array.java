    public class Array {

        private  int[] items;
        private int count;
        public Array(int length){


            items = new int[length];
        }

        public void insert(int item){
            //if is full , resize it
           if(items.length == count) {
               // create new array twice the size
            int[] newItems = new int[count*2];
               //copy all items existing
               for(int i=0;i<count;i++) {
                   newItems[i]= items[i];
               }
               //set items to the new array
                items= newItems;
           }
            //add at the end
            items[count++] = item;

        }

        public void removeAt(int index){
            //validate the index
            if(index >= count|| index < 0){
                throw new IllegalArgumentException();
            }
            //shift the items to the left to fill the hole
        }
        public void print() {
          for(int i=0;i<count;i++){
              System.out.println(items[i]);

          }
        }//print
    }
