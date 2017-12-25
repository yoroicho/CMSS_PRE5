/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Timestamp;

/**
 *
 * @author tokyo
 */
public class ProcessDTO {

    /**
     * フィールド変数
     */
    private String id;
    private Timestamp divtime;
    private String divname;
    private String comment;
    private Timestamp predivtime;
    private String artifactsId;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the divtime
     */
    public Timestamp getDivtime() {
        return divtime;
    }

    /**
     * @param divtime the divtime to set
     */
    public void setDivtime(Timestamp divtime) {
        this.divtime = divtime;
    }

    /**
     * @return the divname
     */
    public String getDivname() {
        return divname;
    }

    /**
     * @param divname the divname to set
     */
    public void setDivname(String divname) {
        this.divname = divname;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return the predivtime
     */
    public Timestamp getPredivtime() {
        return predivtime;
    }

    /**
     * @param predivtime the predivtime to set
     */
    public void setPredivtime(Timestamp predivtime) {
        this.predivtime = predivtime;
    }

    /**
     * @return the artifactsId
     */
    public String getArtifactsId() {
        return artifactsId;
    }

    /**
     * @param artifactsId the artifactsId to set
     */
    public void setArtifactsId(String artifactsId) {
        this.artifactsId = artifactsId;
    }

}