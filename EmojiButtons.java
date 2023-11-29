 
 
 
//emoji radio buttons so user can only select 1 emoji
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
/*
need images for each emoji
 *   images/emoji.gif
 */


 /*😄  😆  😊  🥹  😇 🙃 😉 😌 😍 🥰 😘 😚 😋 </p>
    <p>😝 😜 🤪 🤓 😎 🤩 🥳 😏 😩 🥺 😭 🤯 🥵 </p>
    <p>🤗 🤭 🤤 🤑 🫶 🙌 👌 🤞 🙏 🤙 🫦 👅 💋 </p>
    <p>🤰 💐 🌹 🌷 🌞 🌈 ✨ 🏆 🎊 🎉 🎁 🩷 🧡 </p>
    <p>💛 💚 🩵 💙 💜 🖤 🤍 💔 💞 💓 💗 💖 💘 */

public class EmojiButtons extends JPanel 
                             implements ActionListener {
    static String smilingEmoji = "Smiling";
    static String excitedEmoji = "Excited";
    static String happyEmoji = "Happy";
    static String angelEmoji = "Angel";
    static String upsideDownEmoji = "Upside Down";
    static String winkEmoji = "Wink";
    static String relievedEmoji = "Relieved";
    static String heartEyesEmoji = "Heart Eyes";
    static String enamoredEmoji = "Enamored";
    static String blowKissEmoji = "Blowing Kiss";

    static String tongueOutEmoji = "Savoring";
    static String squintingTongueEmoji = "Squinting Face w/ Tongue";
    static String goofyEmoji = "Goofy Face";
    static String NerdEmoji = "Nerd";
    static String coolEmoji = "Cool";
    static String starStruckEmoji = "Star-Struck";
    static String partyingEmoji = "Partying";
    static String smirkingEmoji = "Smirking";
    static String overwhelmedEmoji = "Overwhelmed";
    static String pleadingEmoji = "Pleading";
    
    static String loudCryEmoji = "Loud Cry";
    static String mindBlownEmoji = "Mind Blown";
    static String hotFaceEmoji = "Hot Face";
    static String hugEmoji = "Hug";
    static String coverMouthEmoji = "Covering Mouth";
    static String droolEmoji = "Drooling";
    static String moneyMouthEmoji = "Loaded";
    static String heartHandsEmoji = "Heart Hands";
    static String raisedHandsEmoji = "Raising Hands";
    static String okHandEmoji = "Ok";

    static String crossedEmoji = "Crossed Fingers";
    static String prayingEmoji = "Folded Hands";
    static String callMeEmoji = "Call Me";
    static String bitingEmoji = "Bite Lips";
    static String tongueEmoji = "Tongue";
    static String kissEmoji = "Kiss";
    static String pregnantEmoji = "Pregnant";
    static String bouquetEmoji = "Bouquet";
    static String roseEmoji = "Rose";
    static String tulipEmoji = "Tulip";

    static String sunFaceEmoji = "Sun Face";
    static String rainbowEmoji = "Rainbow";
    static String sparkleEmoji = "Sparkles";
    static String trophyEmoji = "Trophy";
    static String confettiEmoji = "Confetti Ball";
    static String popperEmoji = "Party Popper";
    static String giftEmoji = "Gift";
    static String pinkEmoji = "Pink Heart";
    static String orangeEmoji = "Orange Heart";
    static String yellowEmoji = "Yellow Heart";

    static String greenEmoji = "Green Heart";
    static String lightblueEmoji = "Light Blue Heart";
    static String blueEmoji = "Blue Heart";
    static String purpleEmoji = "Purple Heart";
    static String blackEmoji = "Black Heart";
    static String whiteEmoji = "White Heart";
    static String brokenEmoji = "Broken Heart";
    static String revolvingEmoji = "Revolving Hearts";
    static String beatingEmoji = "Beating Heart";
    static String growingEmoji = "Growing Heart";
    static String sparklingEmoji = "Sparkling Heart";
    static String cupidEmoji = "Cupid Heart";

    JLabel emojipic;
 
    public EmojiButtons() {
        super(new BorderLayout());
 
        //Create the radio buttons.
        AbstractButton smileButton = new EmojiButton(smilingEmoji);
        smileButton.setMnemonic(KeyEvent.VK_S);
        smileButton.setActionCommand(smilingEmoji);
        smileButton.setSelected(true);

        AbstractButton excitedButton = new EmojiButton(excitedEmoji);
        excitedButton.setMnemonic(KeyEvent.VK_E);
        excitedButton.setActionCommand(excitedEmoji);

        AbstractButton happyButton = new EmojiButton(happyEmoji);
        happyButton.setMnemonic(KeyEvent.VK_H);
        happyButton.setActionCommand(happyEmoji);
 
        AbstractButton angelButton = new EmojiButton(angelEmoji);
        angelButton.setMnemonic(KeyEvent.VK_A);
        angelButton.setActionCommand(angelEmoji);
 
        AbstractButton upsideButton = new EmojiButton(upsideDownEmoji);
        upsideButton.setMnemonic(KeyEvent.VK_U);
        upsideButton.setActionCommand(upsideDownEmoji);

        AbstractButton winkButton = new EmojiButton(winkEmoji);
        winkButton.setMnemonic(KeyEvent.VK_W);
        winkButton.setActionCommand(winkEmoji);
        //winkButton.setSelected(true);
 
        AbstractButton relievedButton = new EmojiButton(relievedEmoji);
        relievedButton.setMnemonic(KeyEvent.VK_R);
        relievedButton.setActionCommand(relievedEmoji);
 
        AbstractButton heartEyesButton = new EmojiButton(heartEyesEmoji);
        heartEyesButton.setMnemonic(KeyEvent.VK_I);
        heartEyesButton.setActionCommand(heartEyesEmoji);
 
        AbstractButton enamoredButton = new EmojiButton(enamoredEmoji);
        enamoredButton.setMnemonic(KeyEvent.VK_L);
        enamoredButton.setActionCommand(enamoredEmoji);
 
        AbstractButton blowKissButton = new EmojiButton(blowKissEmoji);
        blowKissButton.setMnemonic(KeyEvent.VK_B);
        blowKissButton.setActionCommand(upsideDownEmoji);
       
        AbstractButton tongueOutButton = new EmojiButton(tongueOutEmoji);
        tongueOutButton.setMnemonic(KeyEvent.VK_O);
        tongueOutButton.setActionCommand(tongueOutEmoji);
 
        AbstractButton squintButton = new EmojiButton(squintingTongueEmoji);
        squintButton.setMnemonic(KeyEvent.VK_X);
        squintButton.setActionCommand(squintingTongueEmoji);

        AbstractButton goofyButton = new EmojiButton(goofyEmoji);
        goofyButton.setMnemonic(KeyEvent.VK_G);
        goofyButton.setActionCommand(goofyEmoji);
        //winkButton.setSelected(true);
 
        AbstractButton nerdButton = new EmojiButton(NerdEmoji);
        nerdButton.setMnemonic(KeyEvent.VK_N);
        nerdButton.setActionCommand(NerdEmoji);
 
        AbstractButton coolButton = new EmojiButton(coolEmoji);
        coolButton.setMnemonic(KeyEvent.VK_C);
        coolButton.setActionCommand(coolEmoji);
 
        AbstractButton struckButton = new EmojiButton(starStruckEmoji);
        struckButton.setMnemonic(KeyEvent.VK_K);
        struckButton.setActionCommand(starStruckEmoji);
 
        AbstractButton partyButton = new EmojiButton(partyingEmoji);
        partyButton.setMnemonic(KeyEvent.VK_P);
        partyButton.setActionCommand(partyingEmoji);

        AbstractButton smirkButton = new EmojiButton(smirkingEmoji);
        smirkButton.setMnemonic(KeyEvent.VK_J);
        smirkButton.setActionCommand(smirkingEmoji);
 
        AbstractButton overwhelmedButton = new EmojiButton(overwhelmedEmoji);
        overwhelmedButton.setMnemonic(KeyEvent.VK_V);
        overwhelmedButton.setActionCommand(overwhelmedEmoji);
 
        AbstractButton pleadButton = new EmojiButton(pleadingEmoji);
        pleadButton.setMnemonic(KeyEvent.VK_Q);
        pleadButton.setActionCommand(pleadingEmoji);

        AbstractButton cryButton = new EmojiButton(loudCryEmoji);
        cryButton.setMnemonic(KeyEvent.VK_Z);
        cryButton.setActionCommand(loudCryEmoji);
 
        AbstractButton blownButton = new EmojiButton(mindBlownEmoji);
        blownButton.setMnemonic(KeyEvent.VK_M);
        blownButton.setActionCommand(squintingTongueEmoji);

        AbstractButton hotButton = new EmojiButton(hotFaceEmoji);
        //hotButton.setMnemonic(KeyEvent.VK_);
        hotButton.setActionCommand(goofyEmoji);
        //hotButton.setSelected(true);
 
        AbstractButton hugButton = new EmojiButton(hugEmoji);
        hugButton.setMnemonic(KeyEvent.VK_T);
        hugButton.setActionCommand(hugEmoji);
 
        AbstractButton coverButton = new EmojiButton(coverMouthEmoji);
        //coverButton.setMnemonic(KeyEvent.VK_);
        coverButton.setActionCommand(coverMouthEmoji);
 
        AbstractButton droolButton = new EmojiButton(droolEmoji);
        droolButton.setMnemonic(KeyEvent.VK_D);
        droolButton.setActionCommand(droolEmoji);
 
        AbstractButton moneyButton = new EmojiButton(moneyMouthEmoji);
       // moneyButton.setMnemonic(KeyEvent.VK_);
        moneyButton.setActionCommand(moneyMouthEmoji);

        AbstractButton heartHandButton = new EmojiButton(heartHandsEmoji);
        //heartHandButton.setMnemonic(KeyEvent.VK_);
        heartHandButton.setActionCommand(heartHandsEmoji);
 
        AbstractButton raisedHandButton = new EmojiButton(raisedHandsEmoji);
        //raisedHandButton.setMnemonic(KeyEvent.VK_);
        raisedHandButton.setActionCommand(raisedHandsEmoji);
 
        AbstractButton okButton = new EmojiButton(okHandEmoji);
        //okButton.setMnemonic(KeyEvent.VK_);
        okButton.setActionCommand(okHandEmoji);

        AbstractButton crossedButton = new EmojiButton(crossedEmoji);
        //crossedButton.setMnemonic(KeyEvent.VK_Z);
        crossedButton.setActionCommand(crossedEmoji);
 
        AbstractButton prayButton = new EmojiButton(prayingEmoji);
       // prayButton.setMnemonic(KeyEvent.VK_M);
        prayButton.setActionCommand(prayingEmoji);

        AbstractButton callButton = new EmojiButton(callMeEmoji);
        //callButton.setMnemonic(KeyEvent.VK_);
        callButton.setActionCommand(callMeEmoji);
        //callButton.setSelected(true);
 
        AbstractButton biteButton = new EmojiButton(bitingEmoji);
        //biteButton.setMnemonic(KeyEvent.VK_T);
        biteButton.setActionCommand(bitingEmoji);
 
        AbstractButton tongueButton = new EmojiButton(tongueEmoji);
        //tongueButton.setMnemonic(KeyEvent.VK_);
        tongueButton.setActionCommand(tongueEmoji);
 
        AbstractButton kissButton = new EmojiButton(kissEmoji);
        //kissButton.setMnemonic(KeyEvent.VK_D);
        kissButton.setActionCommand(kissEmoji);
 
        AbstractButton pregnantButton = new EmojiButton(pregnantEmoji);
       // pregnantButton.setMnemonic(KeyEvent.VK_);
        pregnantButton.setActionCommand(pregnantEmoji);

        AbstractButton bouquetButton = new EmojiButton(bouquetEmoji);
        //bouquetButton.setMnemonic(KeyEvent.VK_);
        bouquetButton.setActionCommand(bouquetEmoji);
 
        AbstractButton roseButton = new EmojiButton(roseEmoji);
        //roseButton.setMnemonic(KeyEvent.VK_);
        roseButton.setActionCommand(roseEmoji);
 
        AbstractButton tulipButton = new EmojiButton(tulipEmoji);
        //tulipButton.setMnemonic(KeyEvent.VK_);
        tulipButton.setActionCommand(tulipEmoji);

         AbstractButton sunButton = new EmojiButton(sunFaceEmoji);
        //sunButton.setMnemonic(KeyEvent.VK_Z);
        sunButton.setActionCommand(sunFaceEmoji);
 
        AbstractButton rainbowButton = new EmojiButton(rainbowEmoji);
       // rainbowButton.setMnemonic(KeyEvent.VK_M);
        rainbowButton.setActionCommand(rainbowEmoji);

        AbstractButton sparkleButton = new EmojiButton(sparkleEmoji);
        //sparkleButton.setMnemonic(KeyEvent.VK_);
        sparkleButton.setActionCommand(sparkleEmoji);
        //sparkleButton.setSelected(true);
 
        AbstractButton trophyButton = new EmojiButton(trophyEmoji);
        //trophyButton.setMnemonic(KeyEvent.VK_T);
        trophyButton.setActionCommand(trophyEmoji);
 
        AbstractButton confettiButton = new EmojiButton(confettiEmoji);
        //confettiButton.setMnemonic(KeyEvent.VK_);
        confettiButton.setActionCommand(confettiEmoji);
 
        AbstractButton kissButton = new EmojiButton(kissEmoji);
        //kissButton.setMnemonic(KeyEvent.VK_D);
        kissButton.setActionCommand(kissEmoji);
 
        AbstractButton giftButton = new EmojiButton(giftEmoji);
       // giftButton.setMnemonic(KeyEvent.VK_);
       giftButton.setActionCommand(giftEmoji);

        AbstractButton pinkButton = new EmojiButton(pinkEmoji);
        pinkButton.setMnemonic(KeyEvent.VK_1);
        pinkButton.setActionCommand(pinkEmoji);
 
        AbstractButton orangeButton = new EmojiButton(orangeEmoji);
        orangeButton.setMnemonic(KeyEvent.VK_2);
        orangeButton.setActionCommand(orangeEmoji);
 
        AbstractButton yellowButton = new EmojiButton(yellowEmoji);
        yellowButton.setMnemonic(KeyEvent.VK_3);
        yellowButton.setActionCommand(yellowEmoji);

        AbstractButton greenButton = new EmojiButton(greenEmoji);
        greenButton.setMnemonic(KeyEvent.VK_4);
        greenButton.setActionCommand(greenEmoji);
 
        AbstractButton lightblueButton = new EmojiButton(lightblueEmoji);
        lightblueButton.setMnemonic(KeyEvent.VK_5);
        lightblueButton.setActionCommand(lightblueEmoji);

        AbstractButton blueButton = new EmojiButton(blueEmoji);
        blueButton.setMnemonic(KeyEvent.VK_6);
        blueButton.setActionCommand(blueEmoji);
        //sparkleButton.setSelected(true);
 
        AbstractButton purpleButton = new EmojiButton(purpleEmoji);
        purpleButton.setMnemonic(KeyEvent.VK_7);
        purpleButton.setActionCommand(purpleEmoji);
 
        AbstractButton blackButton = new EmojiButton(blackEmoji);
        blackButton.setMnemonic(KeyEvent.VK_8);
        blackButton.setActionCommand(blackEmoji);
 
        AbstractButton whiteButton = new EmojiButton(whiteEmoji);
        whiteButton.setMnemonic(KeyEvent.VK_9);
        whiteButton.setActionCommand(whiteEmoji);
 
        AbstractButton brokenButton = new EmojiButton(brokenEmoji);
       brokenButton.setMnemonic(KeyEvent.VK_0);
       brokenButton.setActionCommand(brokenEmoji);

        AbstractButton revolvingButton = new EmojiButton(revolvingEmoji);
        revolvingButton.setActionCommand(revolvingEmoji);
 
        AbstractButton beatingButton = new EmojiButton(beatingEmoji);
        beatingButton.setActionCommand(beatingEmoji);
 
        AbstractButton growingButton = new EmojiButton(growingEmoji);
        growingButton.setActionCommand(growingEmoji);

        AbstractButton sparklingButton = new EmojiButton(sparklingEmoji);
        sparklingButton.setActionCommand(sparklingEmoji);

        AbstractButton cupidButton = new EmojiButton(cupidEmoji);
        cupidButton.setActionCommand(cupidEmoji);

        //Group the emoji radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(smileButton);
        group.add(excitedButton);
        group.add(happyButton);
        group.add(angelButton);
        group.add(upsideButton);
        group.add(winkButton);
        group.add(relievedButton);
        group.add(heartEyesButton);
        group.add(enamoredButton);
        group.add(blowKissButton);
        group.add(tongueButton);
        group.add(squintButton);
        group.add(goofyButton);
        group.add(nerdButton);
        group.add(coolButton);
        group.add(struckButton);
        group.add(partyButton);
        group.add(smirkButton);
        group.add(overwhelmedButton);
        group.add(pleadButton);
        //-------
        group.add(cryButton);
        group.add(blownButton);
        group.add(hotButton);
        group.add(hugButton);
        group.add(coverButton);
        group.add(droolButton);
        group.add(moneyButton);
        group.add(heartHandButton);
        group.add(raisedHandButton);
        group.add(okButton);
        group.add(crossedButton);
        group.add(prayButton);
        group.add(callButton);
        group.add(biteButton);
        group.add(tongueButton);
        group.add(kissButton);
        group.add(pregnantButton);
        group.add(bouquetButton);
        group.add(roseButton);
        group.add(tulipButton);
         group.add(sunButton);
        group.add(rainbowButton);
        group.add(sparkleButton);
        group.add(trophyButton);
        group.add(confettiButton);
        group.add(partyButton);
        group.add(giftButton);
        group.add(pinkButton);
        group.add(orangeButton);
        group.add(yellowButton);
        group.add(greenButton);
        group.add(lightblueButton);
        group.add(blueButton);
        group.add(purpleButton);
        group.add(blackButton);
        group.add(whiteButton);
        group.add(brokenButton);
        group.add(revolvingButton);
        group.add(beatingButton);
        group.add(growingButton);
        group.add(sparklingButton);
        group.add(cupidButton);
 /*
 
        */

        //Register a listener for the radio buttons.
        excitedButton.addActionListener(this);
        happyButton.addActionListener(this);
        angelButton.addActionListener(this);
        upsideButton.addActionListener(this);
        winkButton.addActionListener(this);
        relievedButton.addActionListener(this);
        heartEyesButton.addActionListener(this);
        enamoredButton.addActionListener(this);
        blowKissButton.addActionListener(this);
        tongueButton.addActionListener(this);
        squintButton.addActionListener(this);
        goofyButton.addActionListener(this);
        nerdButton.addActionListener(this);
        coolButton.addActionListener(this);
        struckButton.addActionListener(this);
        partyButton.addActionListener(this);
        smirkButton.addActionListener(this);
        overwhelmedButton.addActionListener(this);
        pleadButton.addActionListener(this);
        cryButton.addActionListener(this);
        blownButton.addActionListener(this);
        hotButton.addActionListener(this);
        hugButton.addActionListener(this);
        coverButton.addActionListener(this);
        droolButton.addActionListener(this);
        moneyButton.addActionListener(this);
        heartHandButton.addActionListener(this);
        raisedHandButton.addActionListener(this);
        okButton.addActionListener(this);
        kissButton.addActionListener(this);
        pregnantButton.addActionListener(this);
        bouquetButton.addActionListener(this);
        roseButton.addActionListener(this);
        tulipButton.addActionListener(this);
        sunButton.addActionListener(this);
        rainbowButton.addActionListener(this);
        sparkleButton.addActionListener(this);
        trophyButton.addActionListener(this);
        confettiButton.addActionListener(this);
        partyButton.addActionListener(this);
        giftButton.addActionListener(this);
        pinkButton.addActionListener(this);
        orangeButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);
        lightblueButton.addActionListener(this);
        blueButton.addActionListener(this);
        purpleButton.addActionListener(this);
        blackButton.addActionListener(this);
        whiteButton.addActionListener(this);
        brokenButton.addActionListener(this);
        revolvingButton.addActionListener(this);
        beatingButton.addActionListener(this);
        growingButton.addActionListener(this);
        sparklingButton.addActionListener(this);
        cupidButton.addActionListener(this);
        
 

        //Set up the picture label. Working on this atm.
        emojipic = new JLabel(createImageIcon("emojis/" //goes to emojis folder and creates an imageicon
                                             + birdString
                                             + ".jpeg"));
 
        //The preferred size is hard-coded to be the width of the
        //widest image and the height of the tallest image.
    
        emojipic.setPreferredSize(new Dimension(177, 122));
 
 
        //Put the radio buttons in a column in a panel.
        JPanel radioPanel = new JPanel(new GridLayout(0, 1));
        radioPanel.add(excitedButton);
        radioPanel.add(happyButton);
        radioPanel.add(angelButton);
        radioPanel.add(upsideButton);
        radioPanel.add(winkButton);
        radioPanel.add(relievedButton);
        radioPanel.add(heartEyesButton);
        radioPanel.add(enamoredButton);
        radioPanel.add(blowKissButton);
        radioPanel.add(tongueButton);
        radioPanel.add(squintButton);
        radioPanel.add(goofyButton);
        radioPanel.add(nerdButton);
        radioPanel.add(coolButton);
        radioPanel.add(struckButton);
        radioPanel.add(partyButton);
        radioPanel.add(smirkButton);
        radioPanel.add(overwhelmedButton);
        radioPanel.add(pleadButton);
        radioPanel.add(cryButton);
        radioPanel.add(blownButton);
        radioPanel.add(hotButton);
        radioPanel.add(hugButton);
        radioPanel.add(coverButton);
        radioPanel.add(droolButton);
        radioPanel.add(moneyButton);
        radioPanel.add(heartHandButton);
        radioPanel.add(raisedHandButton);
        radioPanel.add(okButton);
        radioPanel.add(kissButton);
        radioPanel.add(pregnantButton);
        radioPanel.add(bouquetButton);
        radioPanel.add(roseButton);
        radioPanel.add(tulipEmoji);
        radioPanel.add(sunButton);
        radioPanel.add(rainbowButton);
        radioPanel.add(sparkleButton);
        radioPanel.add(trophyButton);
        radioPanel.add(confettiButton);
        radioPanel.add(partyButton);

        radioPanel.add(giftButton);
        radioPanel.add(pinkButton);
        radioPanel.add(orangeButton);
        radioPanel.add(yellowButton);
        radioPanel.add(greenButton);
        radioPanel.add(lightblueButton);
        radioPanel.add(blueButton);
        radioPanel.add(purpleButton);
        radioPanel.add(blackButton);
        radioPanel.add(whiteButton);
        radioPanel.add(brokenButton);
        radioPanel.add(revolvingButton);
        radioPanel.add(beatingButton);
        radioPanel.add(growingButton);
        radioPanel.add(sparklingButton);
        radioPanel.add(cupidEmoji);
        
      
        add(radioPanel, BorderLayout.LINE_START);
        add(emojipic, BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    }
 
    /** Listens to the radio buttons. */
    public void actionPerformed(ActionEvent e) {
        emojipic.setIcon(createImageIcon("emojis/"
                                        + e.getActionCommand()
                                        + ".jpeg"));
    }
 
    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static EmojiIcon createEmojiIcon(String path) {
        java.net.URL emojiURL = EmojiButtons.class.getResource(path);
        if (emojiURL != null) {
            return new EmojiIcon();
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Emoji Buttons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        JComponent newContentPane = new EmojiButtons();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread, creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

