package github.io.springboot.conditional;

/**
 * @author bang
 * @date 2018/6/13 22:05
 */
public class SystemService {

    static class WindowsListService implements ListService{
        @Override
        public String showListCmd() {
            return "dir";
        }
    }

    static class LinuxListService implements ListService{
        @Override
        public String showListCmd() {
            return "ls";
        }
    }
}
