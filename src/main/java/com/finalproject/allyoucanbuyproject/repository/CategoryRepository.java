package com.finalproject.allyoucanbuyproject.repository;

import com.finalproject.allyoucanbuyproject.model.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryModel, Long> {
    List<CategoryModel> findByParentIdIsNull();

    List<CategoryModel> findByParentId(CategoryModel categoryModel);
}
