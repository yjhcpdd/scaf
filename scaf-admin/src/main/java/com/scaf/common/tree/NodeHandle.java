package com.scaf.common.tree;

import java.util.Map;

/**
 * 节点持有者（持有节点基本信息）
 */
public interface NodeHandle {
    
    /**
     * 获取节点代码
     * @return
     */
    String fetchNodeCode();
    
    /**
     * 获取节点名称
     * @return
     */
    String fetchNodeName();
    
    /**
     * 获取父级节点代码
     * @return
     */
    default String fetchNodeParentCode(){
        return null;
    }
    
    /**
     * 获取图标
     * @return
     */
    default String fetchNodeIcon(){
        return null;    
    }
    
    /**
     * 是否选中
     * @return
     */
    default Boolean fetchNodeSelected(){
        return false;
    }
    
    /**
     * 是否打开
     * @return
     */
    default Boolean fetchNodeOpened(){
        return false;
    }
    
    /**
     * 获取排序号
     * @return
     */
    default Integer fetchNodeOrder(){
        return 0;
    }
    
    /**
     * 获取扩展属性
     * @return
     */
    default Map<String,Object> fetchNodeExtend(){
        return null;
    }
    

    
}
