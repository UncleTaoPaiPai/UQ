package com.zyz.PageDTO;

import java.util.List;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/7 - 22:56
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
public class PageDTO<T> {

    private int pageNumber;
    private int pageSize;
    private int totalRecord;
    private int totalPage;
    private List<T> list;

    public PageDTO(int pageNumber, int pageSize, int totalRecord) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.totalRecord = totalRecord;
        if (totalRecord % pageSize == 0) {
            totalPage = totalRecord / pageSize;
        }else {
            totalPage = totalRecord / pageSize + 1;
        }
    }

    @Override
    public String toString() {
        return "PageDTO{" +
                "pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                ", totalRecord=" + totalRecord +
                ", totalPage=" + totalPage +
                ", list=" + list +
                '}';
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
