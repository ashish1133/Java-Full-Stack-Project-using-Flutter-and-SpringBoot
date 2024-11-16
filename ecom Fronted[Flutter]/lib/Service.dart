import 'dart:convert';
import 'package:http/http.dart' as http;
import 'Model.dart';

class ApiService {
  final String baseUrl = 'http://localhost:81';  // Match the Spring Boot endpoint


  Future<List<Product>> fetchProducts() async {
    final response = await http.get(Uri.parse(baseUrl));
    if (response.statusCode == 200) {
      Iterable json = jsonDecode(response.body);
      return json.map((product) => Product.fromJson(product)).toList();
    } else {
      throw Exception('Failed to load products');
    }
  }
}
