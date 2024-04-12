package com.deuxiemTP.Exer2;

import java.util.List;

public interface IMetier <T> {

void add(T o);
List<T> getAll();
public T findById(long id);
public boolean delete(long id);



}