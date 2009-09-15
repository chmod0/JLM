package lessons.bat.bool;
import jlm.lesson.Lesson;
import jlm.universe.World;
import universe.bat.BatExercise;
import universe.bat.BatWorld;

public class ArrayFront9 extends BatExercise {
  public ArrayFront9(Lesson lesson) {
    super(lesson);
    
    World[] myWorlds = new BatWorld[12];
    myWorlds[0] = new BatWorld(VISIBLE, {1, 2, 9, 3, 4}) ;
    myWorlds[1] = new BatWorld(VISIBLE, {1, 2, 3, 4, 9}) ;
    myWorlds[2] = new BatWorld(VISIBLE, {1, 2, 3, 4, 5}) ;
    myWorlds[3] = new BatWorld(INVISIBLE, {9, 2, 3}) ;
    myWorlds[4] = new BatWorld(INVISIBLE, {1, 9, 9}) ;
    myWorlds[5] = new BatWorld(INVISIBLE, {1, 2, 3}) ;
    myWorlds[6] = new BatWorld(INVISIBLE, {1, 9}) ;
    myWorlds[7] = new BatWorld(INVISIBLE, {5, 5}) ;
    myWorlds[8] = new BatWorld(INVISIBLE, {2}) ;
    myWorlds[9] = new BatWorld(INVISIBLE, {9}) ;
    myWorlds[10] = new BatWorld(INVISIBLE, {}) ;
    myWorlds[11] = new BatWorld(INVISIBLE, {3, 9, 2, 3, 3}) ;

    setup(myWorlds,"arrayFront9");
  }

  /* BEGIN SKEL */
  public void run(World w) {
    BatWorld bw = (BatWorld) w;
    bw.result = arrayFront9((Integer[])w.getParameter(0));
  }
  /* END SKEL */

  /* BEGIN TEMPLATE */
boolean arrayFront9(int[] nums) {
  /* BEGIN SOLUTION */
  // First figure the end for the loop
  int end = nums.length;
  if (end > 4) end = 4;
  
  for (int i=0; i<end; i++) {
    if (nums[i] == 9) return true;
  }
  
  return false;
  /* END SOLUTION */
}
  /* END TEMPLATE */
}
