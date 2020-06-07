package com.scaf.common.tree;

import java.util.List;
import java.util.Map;

/**
 * 节点信息
 */
public class Node implements NodeFormat{
    
    /**
     * 节点代码
     */
    private String nodeCode;
    
    /**
     * 节点名称
     */
    private String nodeName;
    
    /**
     * 节点图标
     */
    private String nodeIcon;
    
    /**
     * 是否选中
     */
    private Boolean nodeSelected;
    
    /**
     * 是否打开
     */
    private Boolean nodeOpened;
    
    /**
     * 排序号
     */
    
    private Integer nodeOrder;
    
    /**
     * 扩展属性
     */
    private Map<String,Object> nodeExtend;
    
    /**
     * 子节点
     */
    private List<Node> childNodeList;
    
    /**
     * 节点格式化
     */
    private NodeFormat nodeFormat;
    
    public Node(NodeHandle nodeHandle){
        if(nodeHandle!=null){
            this.nodeCode=nodeHandle.fetchNodeCode();
            this.nodeName=nodeHandle.fetchNodeName();
            this.nodeIcon=nodeHandle.fetchNodeIcon();
            this.nodeSelected=nodeHandle.fetchNodeSelected();
            this.nodeOpened=nodeHandle.fetchNodeOpened();
            this.nodeOrder=nodeHandle.fetchNodeOrder();
            this.nodeExtend=nodeHandle.fetchNodeExtend();
        }
    }
    
    
    @Override
    public String toJson() {
        return null;
    }
}
