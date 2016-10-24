package test;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.TaskService;
import org.activiti.engine.impl.ProcessEngineImpl;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.impl.interceptor.CommandInterceptor;
import org.activiti.engine.impl.persistence.entity.TaskEntity;
import org.activiti.engine.impl.persistence.entity.TaskEntityManager;

/**

      @desc <p>能够自己处理一些事物</p>
 *          <code>activiti 激活</code><code>engine 发动机 </code>
 *    @see org.activiti.engine.ProcessEngine   核心接口
 *    @<method>
 *        1 getName()---process-engine-name
 *        2 close();
 *    </method>
 *    <p>
  *        配置文件：activiti.cfg.xml 存放了 process-engine-name  默认是default
 *
 *    </p>
 *    @see org.activiti.engine.RuntimeService  <ques>given key</ques>
 *          @<method> 1 ProcessInstance startProcessInstanceByKey(String key) ----定义进程必须的key </method>
 *              提供一个在给予key的最新版本下的进程中开启一个新的进程
 *    @see org.activiti.engine.runtime.ProcessInstance ---代表了一个exceution进程
 *
 */
public class TestActiviti {

    /**
     *
     * @param args
     */
    public static void main(String[] args){

    }

    /**
     * 调用一个流程之前需要做：
     * 1 任务对象
     * 2 得到一个
     * @see org.activiti.engine.task.Task 接口
     * @see org.activiti.engine.impl.persistence.entity.TaskEntity  核心类
     * @see  org.activiti.engine.impl.persistence.entity.TaskEntityManager  ---get one task
     *
     */
    public void test(){
        //1 get access to the server
        ProcessEngineImpl processEngine=new ProcessEngineImpl(null);
        new ProcessEngineConfigurationImpl() {
            @Override
            protected CommandInterceptor createTransactionInterceptor() {
                return null;
            }
        }.buildProcessEngine();
        //2 get the service which  you need
        TaskService taskService=processEngine.getTaskService();// access the task and form the task

        RepositoryService processService=processEngine.getRepositoryService();// access to the repository of defined and deployed ---process

        //3 by the service to do that you want to do
        TaskEntity taskEntity=new TaskEntity();

        taskService.complete(taskEntity.getId());//任务Id
    }
    /**
     * 1 InitConfirguations();
     * @see  org.activiti.engine.impl.ProcessDefinitionQueryImpl
     */


}
