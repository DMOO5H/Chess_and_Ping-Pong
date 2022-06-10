import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPane1;

public class ChessGame {
    public static LinkedList<Piece> ps=new LinkedList<>();
    public static void main(String[] args) {
        
        BufferedImage all=ImageIO.read(new File ("/Users/darryl/Documents/Java Final Project/2560px-Chess_Pieces_Sprite.svg.png"))
        Image imgs[]=new Image[12];
        int ind=0;
        for(int y=0;y<400;y+=200) {
        for(int x=0;x<1200;x+=200) {
            imgs[ind]=all.getSubimage(x, y, 200, 200).getScaledInstance(64, 64, BufferedImage.SCALE_SMOOTH);
        ind++;
        }
        }
        Piece bRook1=new Piece(0, 0, false, "Rook", ps);
        Piece bKnight1=new Piece(1, 0, false, "Knight", ps);
        Piece bBishop1=new Piece(2, 0, false, "Bishop", ps);
        Piece bQueen=new Piece(3, 0, false, "Queen", ps);
        Piece bKing=new Piece(4, 0, false, "King", ps);
        Piece bBishop2=new Piece(5, 0, false, "Bishop", ps);
        Piece bKnight2=new Piece(6, 0, false, "Knight", ps);
        Piece bRook2=new Piece(7, 0, false, "Rook", ps);
        Piece bpawn1=new Piece(1, 1, false, "Pawn", ps);
        Piece bpawn2=new Piece(2, 1, false, "Pawn", ps);
        Piece bpawn3=new Piece(3, 1, false, "Pawn", ps);
        Piece bpawn4=new Piece(4, 1, false, "Pawn", ps);
        Piece bpawn5=new Piece(5, 1, false, "Pawn", ps);
        Piece bpawn6=new Piece(6, 1, false, "Pawn", ps);
        Piece bpawn7=new Piece(7, 1, false, "Pawn", ps);
        Piece bpawn8=new Piece(8, 1, false, "Pawn", ps);

        Piece wRook1=new Piece(0, 7, true, "Rook", ps);
        Piece wKnight1=new Piece(1, 7, true, "Knight", ps);
        Piece wBishop1=new Piece(2, 7, true, "Bishop", ps);
        Piece wQueen=new Piece(3, 7, true, "Queen", ps);
        Piece wKing=new Piece(4, 7, true, "King", ps);
        Piece wBishop2=new Piece(5, 7, true, "Bishop", ps);
        Piece wKnight2=new Piece(6, 7, true, "Knight", ps);
        Piece wRook2=new Piece(7, 7, true, "Rook", ps);
        Piece wpawn1=new Piece(1, 6, true, "Pawn", ps);
        Piece wpawn2=new Piece(2, 6, true, "Pawn", ps);
        Piece wpawn3=new Piece(3, 6, true, "Pawn", ps);
        Piece wpawn4=new Piece(4, 6, true, "Pawn", ps);
        Piece wpawn5=new Piece(5, 6, true, "Pawn", ps);
        Piece wpawn6=new Piece(6, 6, true, "Pawn", ps);
        Piece wpawn7=new Piece(7, 6, true, "Pawn", ps);
        Piece wpawn8=new Piece(0, 6, true, "Pawn", ps);
        JFrame frame = new JFrame();
        frame.setBounds(10, 10, 512, 512);
        frame.setUndecorated(true);
        JPane1 pn = new JPane1 (); {
            @Override
            public void paint (Graphics g) {
            boolean white=true;
                for(int y= 0;y<8;y++) {
            for(int x= 0;x<8;x++) {
                if(white) {
                    g.setColor(Color.white);
                } else {
                    g.setColor(Color.black);
                }
                g.fillRect(x*64, y*64, 64, 64);
            white=!white;
            }
            white=!white;
            }
                for(Piece p: ps) {
                     int ind=0;
                     if(p.name.equalsIgnoreCase("King")) {
                        ind=0;
                     } if(p.name.equalsIgnoreCase("Queen")) {
                        ind=1;
                     } if(p.name.equalsIgnoreCase("Bishop")) {
                        ind=2;
                     } if(p.name.equalsIgnoreCase("Knight")) {
                        ind=3;
                     } if(p.name.equalsIgnoreCase("Rook")) {
                        ind=4;
                     } if(p.name.equalsIgnoreCase("Queen")) {
                        ind=5;
                     } if(!p.isWhite) {
                        ind+=5;
                     }
                     g.drawImage(imgs[ind], p.x, p.y, this);
                }
            }


        };
        frame.add(pn);
        frame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                throw new UnsupportedOperationException("Not Supperted Yet.");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                throw new UnsupportedOperationException("Not Supported Yet.");
            }
        });
        frame.addMouseListener(new MouseMotionListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                throw new UnsupportedOperationoExecption("Not Supported Yet.");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                throw new UnsupportedOperationoExecption("Not Supported Yet.");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationoExecption("Not Supported Yet.");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                throw new UnsupportedOperationoExecption("Not Supported Yet.");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                throw new UnsupportedOperationoExecption("Not Supported Yet.");
            }
        });
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
    public static Piece getPiece(int x, int y) {
        int xp=x/64;
        int yp=y/64;
        for(Piece p: ps) {
            if(p.xp=xp&&yp==yp) {
                return p;
            }
        }
        return null;
    }
}