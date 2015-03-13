package za.ac.cput.chapter5assignment;

/**
 * Created by student on 2015/03/12.
 */
public class GradeAHandler extends GradeHandler {
    @Override
    public String handleRequest(int request) {
        if(request > 75){
            return "A";
        }else{
            return successor.handleRequest(request);
        }
    }
}
