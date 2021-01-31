/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula13_mario_stack;

/**
 *
 * @author JFernandes
 */

import java.util.ArrayList;

public class Stack<T> {
  private final ArrayList<T> elements = new ArrayList<>();

  @Override
  public String toString() {
    return "Stack{" + "elements=" + elements + '}'; 
  }

  public void push(T obj) {
    elements.add(obj);
  }

  public boolean isEmpty() { return elements.isEmpty(); }

  // se a pilha estiver vazia, lança StackUnderFlowException()
  //senao remove e devolve o ultimo elemento inserido
  public T pop() {
    if (isEmpty()) throw new StackUnderFlowException();
    return elements.remove(elements.size()-1);
  } 

  public int size() { return elements.size(); }

}

