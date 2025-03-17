public class SearchController {
    
    public SearchResult search(String query) {
        // 优化搜索算法
        return new OptimizedSearchAlgorithm().search(query);
    }
}
