package cn.shaoxiongdu.leagueoflegends.bean;

import java.util.List;

/**
 * @description: 分页实体类
 * @author: shaoxiongdu <email@shaoxiongdu.cn>
 * @date: 2021-10-16 | 21:59
 */
public class Page<T> {

    /**
     * 当前页码
     */
    private Integer pageNo;

    /**
     * 总页码
     */
    private long totalPageNo;

    /**
     * 总记录数
     */
    private Long totalCount;

    /**
     * 每页数量
     */
    private Integer pageSize;

    /**
     * 当前页数据
     */
    private List<T> items;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer currentPageNo) {
        this.pageNo = currentPageNo;
    }

    public long getTotalPageNo() {
        return totalPageNo;
    }

    public void setTotalPageNo(long totalPageNo) {
        this.totalPageNo = totalPageNo;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}
