package module_3.practice3_3;

public interface Database {
  void connect();
  void disconnect();
  void insert(String data);
  void update(String data);
  void delete(String data);
}
