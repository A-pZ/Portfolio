package com.Needwork.Needwork.Mapper;

import com.Needwork.Needwork.Model.FormModel;
import com.Needwork.Needwork.Model.ListDataModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ListDataMapper {
    //追加処理
    void insert(FormModel formModel);

    //idを指定しての選択
    ListDataModel select(int id);

    //全選択処理
    List<ListDataModel> selectAll();

    //更新処理
    void update(ListDataModel listDataModel);
}
