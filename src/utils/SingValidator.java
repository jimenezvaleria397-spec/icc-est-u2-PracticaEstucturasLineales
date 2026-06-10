package utils;

import java.util.Stack;

public class SingValidator {
    public boolean isValid(String s){
        Stack<Character> stack =  new Stack<>();
        for(char c : s.toCharArray()){
            if(c== '('){
                stack.push(c);
                }else if(c== '{'){
                    stack.push(c);
                }else if (c == '['){
                    stack.push(c);
                }else{
                    if(stack.isEmpty()){
                        return false;
                    }
                }
                char top = stack.pop();
                if(c== ')'){
                    if(top != '('){
                        return false;
                    }
                }else if (c == '{'){
                    if(top != '{'){
                        return false;
                    }
                }else if (c == ']'){
                    if(top != '['){
                        return false;
                    }
                }
                

            }
    }
    }
    return stack.isEmpty();
    }


