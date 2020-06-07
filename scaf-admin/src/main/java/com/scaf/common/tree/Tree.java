package com.scaf.common.tree;

import java.util.List;

/**
 * 树
 */
public class Tree {
    
    /**
     * 节点持有者列表
     */
    private List<NodeHandle> nodeHandleList;
    
    /**
     * 根节点代码列表
     */
    private List<String> rootCodeList;
    
    /**
     * 节点信息
     */
    private List<Node> nodeList;
    
    public Tree(List<NodeHandle> nodeHandleList){
        this.nodeHandleList=nodeHandleList;
        initNodeResource();
    }
    
    public Tree(List<NodeHandle> nodeHandleList,List<String> rootCodeList){
        this.nodeHandleList=nodeHandleList;
        this.rootCodeList=rootCodeList;
        initNodeResource();
    }
    
    /**
     * 初始化节点信息
     */
    private void initNodeResource(){
        
    }
    
    /**
     * 转换为json字符串
     * @return
     */
    public String toJson(){
        StringBuffer json=new StringBuffer();
        json.append("{");
        if(nodeList!=null && nodeList.size()>0){
            for(Node node:nodeList){
                json.append(node.toJson());
            }
        }
        json.append("}");
        return json.toString();
    }
    
}
