
import java.util.List;
import java.util.Map;

public class Pojo {


    private Long checkInterval;

    private Long checkTime;

    private Long delayTime;

    private List<Object> inputTable;

    private List<Object> localParams;

    private List<Object> outTable;

    private Long pluginId;

    private Map<String,String> pluginParmas;

    private List<Object> resourceList;

    public Long getCheckInterval() {
        return checkInterval;
    }

    public void setCheckInterval(Long checkInterval) {
        this.checkInterval = checkInterval;
    }

    public Long getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Long checkTime) {
        this.checkTime = checkTime;
    }

    public Long getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Long delayTime) {
        this.delayTime = delayTime;
    }

    public List<Object> getInputTable() {
        return inputTable;
    }

    public void setInputTable(List<Object> inputTable) {
        this.inputTable = inputTable;
    }

    public List<Object> getLocalParams() {
        return localParams;
    }

    public void setLocalParams(List<Object> localParams) {
        this.localParams = localParams;
    }

    public List<Object> getOutTable() {
        return outTable;
    }

    public void setOutTable(List<Object> outTable) {
        this.outTable = outTable;
    }

    public Long getPluginId() {
        return pluginId;
    }

    public void setPluginId(Long pluginId) {
        this.pluginId = pluginId;
    }

    public Map<String, String> getPluginParmas() {
        return pluginParmas;
    }

    public void setPluginParmas(Map<String, String> pluginParmas) {
        this.pluginParmas = pluginParmas;
    }


    public List<Object> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<Object> resourceList) {
        this.resourceList = resourceList;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "checkInterval=" + checkInterval +
                ", checkTime=" + checkTime +
                ", delayTime=" + delayTime +
                ", inputTable=" + inputTable +
                ", localParams=" + localParams +
                ", outTable=" + outTable +
                ", pluginId=" + pluginId +
                ", pluginParmas=" + pluginParmas +
                ", resourceList=" + resourceList +
                '}';
    }
}
