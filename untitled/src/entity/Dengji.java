package entity;

 import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * Created by admin on 2016/10/17.
 */

@Entity
@Table(name="OA_Dengji")
public class Dengji implements Serializable{
    private String processInstanceId;
    private String userId;
    private String dengjiTime;
    private String reason;

    ///
    private Task task;

    private Map<String,Object> map;

    private ProcessInstance processInstance;

    private HistoricProcessInstance historicProcessInstance;

    private ProcessDefinition processDefinition;

    @Column
    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    @Column
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Column
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    @Transient
    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
    @Transient
    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
    @Transient
    public ProcessInstance getProcessInstance() {
        return processInstance;
    }

    public void setProcessInstance(ProcessInstance processInstance) {
        this.processInstance = processInstance;
    }
    @Transient
    public HistoricProcessInstance getHistoricProcessInstance() {
        return historicProcessInstance;
    }

    public void setHistoricProcessInstance(HistoricProcessInstance historicProcessInstance) {
        this.historicProcessInstance = historicProcessInstance;
    }
    @Transient
    public ProcessDefinition getProcessDefinition() {
        return processDefinition;
    }

    public void setProcessDefinition(ProcessDefinition processDefinition) {
        this.processDefinition = processDefinition;
    }

    @Column
    public String getDengjiTime() {
        return dengjiTime;
    }

    public void setDengjiTime(String dengjiTime) {
        this.dengjiTime = dengjiTime;
    }
}
