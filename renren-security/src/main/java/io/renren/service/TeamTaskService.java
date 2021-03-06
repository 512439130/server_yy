package io.renren.service;

import io.renren.entity.Team;
import io.renren.entity.TeamFriend;
import io.renren.entity.TeamMember;
import io.renren.entity.TeamNews;
import io.renren.entity.TeamTask;
import io.renren.entity.User;

import java.util.List;
import java.util.Map;

public interface TeamTaskService {
        
        /**
         * 获取所有社团活动
         */
        List<TeamTask> getTeamTask();
        
        
        /**
         * 获取所有社团活动(负责人获取)
         */
        List<TeamTask> getTeamTaskById(Map<String, Object> map);
        
        /**
         * 发布社团活动
         */
        int addTeamTask(TeamTask teamTask);
        
        
        /**
         * 填写活动总结
         */
        int setTeamTaskSummary(Map<String, Object> map);
        
        /**
         * 填写活动总结
         */
        int auditTeamTaskSummary(Map<String, Object> map);
        
        /**
         * 获取所有社团活动(社长获取)
         */
        List<TeamTask> getTeamTaskByTeamId(Map<String, Object> map);
        
        
        
        
        
	
}
