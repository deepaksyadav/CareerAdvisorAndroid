package org.deepakyadav.careeradviser;
import java.util.ArrayList;
import java.util.List;


public class CareerExpert {
    List<String> getStreams(String course) {
        List<String> stream = new ArrayList<String>();
        if (course.equals("Bio")) {
            stream.add("MBBS");
            stream.add("B.Sc Biologist");
        } else {
            stream.add("B.Tech");
            stream.add("B.Sc. PCM");
        }
        return stream;
    }
}
