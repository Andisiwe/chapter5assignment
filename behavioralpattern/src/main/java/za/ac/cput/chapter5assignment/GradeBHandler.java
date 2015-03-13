package za.ac.cput.chapter5assignment;

/**
 * Created by student on 2015/03/12.
 */
public class GradeBHandler extends GradeHandler{
    @Override
    public String handleRequest(int request) {
        if(request > 70 & request < 75){
            return "B";
        }else{
            return successor.handleRequest(request);
        }
    }
}
