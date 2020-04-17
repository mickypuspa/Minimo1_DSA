/*package edu.upc.dsa;

import edu.upc.dsa.models.Video;

import java.util.List;
import org.apache.log4j.Logger;

public class VideoManagerImpl implements VideoManager {

    private static VideoManager instance;
    protected List<Video> videos;
    final static Logger logger = Logger.getLogger(VideoManagerImpl.class);

    public static VideoManager getInstance(){
        if(instance==null) instance = new VideoManagerImpl();
        return instance;
    }

    public int size(){
        int res = this.videos.size();
        logger.info("size: "+res);

        return res;
    }

    public Video addVideo(Video v){
        logger.info("new Video "+ v);

        this.videos.add(v);
        logger.info("new Video added");
        return v;
    }

    public Video addVideo(String title, String duration){
        return this.addVideo(new Video(title,duration));
    }

    public Video getVideo(String id){
        logger.info("getVideo("+id+")");

        for (Video v: this.videos){
            if (v.getId().equals(id)){
                logger.info("getVideo("+id+")"+v);

                return v;
            }
        }

        logger.info("not found"+id);
        return null;
    }

    public List<Video> findAll() { return this.videos;}

    @Override
    public void delVideo(String id) {

        Video v = this.getVideo(id);
        if(v==null){
            logger.info("Video not found"+v);

        }
        else logger.info(v+"deleted");

        this.videos.remove(v);
    }

    @Override
    public Video updateVideo(Video v) {
        Video vid = this.getVideo(v.getId());

        if(vid==null)
            logger.info("Not recived");

        else{
            logger.info(v+"recived");

            vid.setTitle(v.getTitle());
            vid.setDuration(v.getDuration());

            logger.info(v+"Updated");

        }

        return vid;

    }
} */
