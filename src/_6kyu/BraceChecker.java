package _6kyu;

import java.util.Stack;

public class BraceChecker {
    public static void main(String[] args) {
        System.out.println(isValid("())({}}{()][]["));
    }

    public static boolean isValid(String braces) {
        if (braces == null || braces.isEmpty()) {
            return true;
        }
        if (braces.charAt(0) == ')' || braces.charAt(0) == '}' || braces.charAt(0) == ']') {
            return false;
        }

        char[] brace = braces.toCharArray();
        boolean x = true;
        for (int i = 0; i < braces.length(); i++) {
            if (x == false) {
                return false;
            }
            if (brace[i] == '(') {
                for (int j = i + 1; j < braces.length(); j = j + 2) {
                    if (brace[j] == ')') {
                        x = true;
                        break;
                    }
                    x = false;
                }
            } else if (brace[i] == '{') {
                for (int j = i + 1; j < braces.length(); j = j + 2) {
                    if (brace[j] == '}') {
                        x = true;
                        break;
                    }
                    x = false;
                }
            } else if (brace[i] == '[') {
                for (int j = i + 1; j < braces.length(); j = j + 2) {
                    if (brace[j] == ']') {
                        x = true;
                        break;
                    }
                    x = false;
                }
            } else if (brace[i] == ')') {
                for (int j = i - 1; j >= 0; j = j - 2) {
                    if (j >= 0 && brace[j] == '(') {
                        x = true;
                        break;
                    }
                    x = false;
                }
            } else if (brace[i] == ']') {
                for (int j = i - 1; j >= 0; j = j - 2) {
                    if (j >= 0 && brace[j] == '[') {
                        x = true;
                        break;
                    }
                    x = false;
                }
            } else if (brace[i] == '}') {
                for (int j = i - 1; j >= 0; j = j - 2) {
                    if (j >= 0 && brace[j] == '{') {
                        x = true;
                        break;
                    }
                    x = false;
                }
            }
        }
        return x;
    }
}

/*
public boolean isValid(String braces) {
    String prev = "";
    while (!prev.equals(braces)) {
      prev = braces;
      braces = braces.replace("()", "");
      braces = braces.replace("[]", "");
      braces = braces.replace("{}", "");
    }
    return braces.isEmpty();
  }
 */