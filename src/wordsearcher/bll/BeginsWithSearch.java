/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearcher.bll;

/**
 *
 * @author pgn
 */
public class BeginsWithSearch extends QuerySearchTemplate {

    public BeginsWithSearch(String query, boolean caseSensitive) {
        super(query, caseSensitive);
    }

    @Override
    public boolean compare(String word) {
        if (!caseSensitive) {
            return word.toLowerCase().startsWith(query.toLowerCase());
        } else {
            return word.startsWith(query);
        }
    }

}
