package tankegame03;


import java.util.Vector;

public class EnemyTank extends Tank implements Runnable {
    Vector<Shot> shots = new Vector<>();
    Vector<EnemyTank> enemyTanks = new Vector<>();
    boolean isLive = true;

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    //这里提供一个方法，可以将MyPanel 成员 Vector<EnemyTank> enemyTanks = new Vector<>();
    //设置到 EnemyTank 的成员 enemyTanks

    public void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        this.enemyTanks = enemyTanks;
    }

    //编写方法，判断当前敌方坦克是否和enemyTanks中的其他坦克发生了重叠或者是碰撞

    public boolean isTouchEnemyTank() {

        //判断当前坦克(this)方向
        switch (this.getDirect()) {
            case 0:
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (enemyTank != this) {
                        //当前若敌人坦克是上/下
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {

                                return true;
                            }
                        }
                        //当前若敌人坦克是左/右
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {

                                return true;
                            }
                        }

                    }

                }
                break;
            case 1:
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (enemyTank != this) {

                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            //当前若敌人坦克是右上角的坐标 [this.getX() + 60 ，this.gexY()]

                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {

                                return true;
                            }
                            //当前若敌人坦克是右上角的坐标 [this.getX() + 60 ，this.gexY()+40]
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 60) {

                                return true;
                            }
                        }


                        //当前若敌人坦克是左/右
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            //当前若敌人坦克是右上角的坐标 [this.getX() + 60 ，this.gexY()]
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {

                                return true;
                            }
                            //当前若敌人坦克是右下角的坐标 [this.getX() + 60 ，this.gexY()]
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 60
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 60) {

                                return true;
                            }
                        }
                    }
                }
                break;
            case 2://下
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (enemyTank != this) {

                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            //当前若敌人坦克是右上角的坐标 [this.getX() + 60 ，this.gexY()+60]

                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 60) {

                                return true;
                            }
                            //当前若敌人坦克是右下角的坐标 [this.getX() + 40 ，this.gexY()+60]
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 60
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 40) {

                                return true;
                            }
                        }


                        //当前若敌人坦克是左/右
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            //当前若敌人坦克是左上角的坐标 [this.getX() ，this.gexY()]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 40) {

                                return true;
                            }
                            //当前若敌人坦克是左下角的坐标 [this.getX() + 60 ，this.gexY()]
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 60
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 40) {

                                return true;
                            }
                        }
                    }
                }
                break;
            case 3:
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (enemyTank != this) {

                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            //当前若敌人坦克是左上角的坐标 [this.getX() ，this.gexY()]

                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {

                                return true;
                            }
                            //当前若敌人坦克是右下角的坐标 [this.getX() + 40 ，this.gexY()+60]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 60) {

                                return true;
                            }
                        }


                        //当前若敌人坦克是左/右
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            //当前若敌人坦克是左上角的坐标 [this.getX() ，this.gexY()]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {

                                return true;
                            }
                            //当前若敌人坦克是左下角的坐标 [this.getX() + 60 ，this.gexY()+40]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 40) {

                                return true;
                            }
                        }
                    }
                }
                break;
        }
        return false;
    }

    @Override
    public void run() {
        while (true) {
            if (shots.size() < 10 && isLive) {
                Shot shot = null;
                switch (getDirect()) {
                    case 0:
                        shot = new Shot(getX() + 20, getY(), 0);
                    case 1:
                        shot = new Shot(getX() + 60, getY() + 20, 1);
                    case 2:
                        shot = new Shot(getX() + 20, getY() + 60, 2);
                    case 3:
                        shot = new Shot(getX(), getY() + 20, 3);
                        break;
                }
                shots.size();
                new Thread(shot).start();

            }
            switch (getDirect()) {
                case 0:
                    for (int i = 0; i < 30; i++) {
                        if (getY() > 0 && !isTouchEnemyTank()) {
                            moveUp();
                        }

                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;

                case 1:
                    for (int i = 0; i < 30; i++) {
                        if (getX() + 60 < 1000 && !isTouchEnemyTank()) {
                            moveRight();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < 30; i++) {
                        if (getY() + 60 < 750 && !isTouchEnemyTank()) {
                            moveDown();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 30; i++) {
                        if (getX() > 0 && !isTouchEnemyTank()) {
                            moveLeft();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setDirect((int) (Math.random() * 4));
            if (!isLive) {
                break;//敌方坦克以阵亡
            }
        }
    }
}
