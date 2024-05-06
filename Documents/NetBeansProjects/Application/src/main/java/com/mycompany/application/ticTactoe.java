    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package com.mycompany.application;

    import java.awt.*;
    import java.awt.event.*;
    import javax.swing.*;



    public class ticTactoe {
        int boardwidth = 600;
        int boardheight = 650;

        JFrame frame = new JFrame("Activity1");
        
        JLabel textlabel = new JLabel();
        JPanel textpanel = new JPanel (); //similar to div in html
        
        JPanel boardpanel = new JPanel();
        JButton[][] board = new JButton [3][3]; //arrays
        
        String player1 = "X";
        String player2 = "O";
        String currentplayer = player1;
        
        boolean GameOver = false;
        
        int turns = 0;

        ticTactoe(){
            frame.setVisible(true);
            frame.setSize(boardwidth,boardheight);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());
            
            textlabel.setBackground(Color.black);
            textlabel.setForeground(Color.white);
            textlabel.setFont(new Font("Arial", Font.BOLD, 50));
            textlabel.setHorizontalAlignment(JLabel.CENTER);
            textlabel.setText("Tic-Tac-Toe");
            textlabel.setOpaque(true);
            
            textpanel.setLayout(new BorderLayout());
            textpanel.add(textlabel);
            frame.add(textpanel, BorderLayout.NORTH);
            
            boardpanel.setLayout(new GridLayout(3, 3));
            boardpanel.setBackground(Color.LIGHT_GRAY);
            frame.add (boardpanel);
            
            for (int r =0; r < 3; r++){
                for (int c = 0; c < 3; c++){
                    JButton tile = new JButton();
                    board [r] [c] = tile;
                    boardpanel.add(tile);
                    tile.setBackground(Color.LIGHT_GRAY);
                    tile.setForeground(Color.WHITE);
                    tile.setFont(new Font ("Arial", Font.BOLD, 120));
                    tile.setFocusable(false);
                    
                    tile.addActionListener(new ActionListener () {
                            public void actionPerformed(ActionEvent e){
                                if (GameOver) return;
                                JButton tile = (JButton) e.getSource();
                                if (tile.getText() == ""){
                                    tile.setText(currentplayer);
                                    turns++;
                                    checkWinner();
                                    if(!GameOver){
                                        currentplayer = currentplayer == player1 ? player2 : player1;
                                        textlabel.setText(currentplayer + " 's Turn");
                                    }
                                }
                              
                            }
                    });
                }
            }
        }
void checkWinner(){
    //horizontal
    for (int r = 0; r < 3; r++){
        if (board [r][0].getText()=="") continue;
        
        if(board[r][0].getText() == board [r][1].getText() &&
           board[r][1].getText() == board [r][2].getText()){
            for(int i = 0; i < 3; i++){
                setWinner(board[r][i]);
            }
            GameOver = true;
            return;
        }
    }
    //vertical
        for (int c = 0; c < 3; c++){
        if (board [0][c].getText()=="") continue;
        
        if(board[0][c].getText() == board [1][c].getText() &&
           board[1][c].getText() == board [2][c].getText()){
            for(int i = 0; i < 3; i++){
                setWinner(board[i][c]);
            }
            GameOver = true;
            return;
        }
        }
        //diagonal
        if(board[0][0].getText() == board [1][1].getText() &&
           board[1][1].getText() == board [2][2].getText() &&
           board [0][0].getText() != ""){
            for (int i = 0; i < 3; i++){
                setWinner(board[i][i]);
            }
            GameOver = true;
            return;
    }
    //antidiagonal
    if(board[0][2].getText() == board [1][1].getText() &&
           board[1][1].getText() == board [2][0].getText() &&
           board [0][2].getText() != ""){
           setWinner(board[2][0]);
           setWinner(board[1][1]);
           setWinner(board[0][2]);

            GameOver = true;
            return;
    }
    
    if (turns == 9){
        for ( int r = 0; r < 3; r++ ){
            for (int c = 0; c < 3; c++){
                setTie(board[r][c]);
                
            }
        }
        GameOver = true;
    }
                   
        
    
}
void setWinner(JButton tile){
    tile.setForeground(Color.pink);
    tile.setBackground(Color.white);
    textlabel.setText(currentplayer + " is the WINNER!");
    
}

void setTie(JButton tile){
    tile.setForeground(Color.red);
    tile.setBackground(Color.gray);
    textlabel.setText("It's a TIE");
}



    }
    
