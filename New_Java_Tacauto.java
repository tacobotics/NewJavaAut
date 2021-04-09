package org.firstinspires.ftc.teamcode;


import com.qualcomm.ftccommon.SoundPlayer;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.android.AndroidSoundPool;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaCurrentGame;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;
import org.firstinspires.ftc.robotcore.external.tfod.Recognition;
import org.firstinspires.ftc.robotcore.external.tfod.TfodCurrentGame;

import java.util.List;

@Autonomous(name = "New_Java_Tacauto")

public class New_Java_Tacauto extends Taco_Super_class {

    double Shooter_Speed;
    @Override
    public void runOpMode() {
        List<Recognition> recognitions;
        initialization(true);

        telemetry.addData(">", "Wait To Start!!!!!!!!!!!!!!!!!!");
        telemetry.update();
        Shooter_Speed = 0.65;
        }

    public void Zone_A() {
        driveForwardEncoders(1000,1);
        sleep(500);
        driveright(1050,.7);
        driveForwardEncoders(1250,.6);
        sleep(700);
        Shooter_Speed = 0.67;
        sleep(10);

        shoot(false,false, true);
        sleep(500);
        shoot(false,false, true);
        indexer.setPosition(0);
        shoot(false,false, true);
        sleep(750);
        shoot(false,false, true);
        indexer.setPosition(0.65);
        shoot(false,false, true);
        sleep(750);
        shoot(false,false, true);
        indexer.setPosition(0);
        shoot(false,false, true);
        sleep(750);
        shoot(false,false, true);
        indexer.setPosition(0.65);
        shoot(false,false, false);
        shoot(false,false, true);
        sleep(500);
        shoot(false,false, true);
        indexer.setPosition(0);
        shoot(false,false, true);
        sleep(750);
        shoot(false,false, true);
        indexer.setPosition(0.65);
        shoot(false,false, true);
        sleep(750);
        shoot(false,false, true);
        indexer.setPosition(0);
        shoot(false,false, true);
        sleep(750);
        shoot(false,false, true);
        indexer.setPosition(0.65);
        shoot(false,false, false);

        driveleft(300,.5);
        driveForwardEncoders(500,.7);
        //drop it
        pincher.setPosition(0);
        driveBackwardEncoders(2900,5);
        sleep(1000);
        pincher.setPosition(.99);
        driveForwardEncoders(2900,.5);
        pincher.setPosition(0);
        driveBackwardEncoders(1000,1);
        sleep(30000);
    }

    public void Zone_B() {
    driveForwardEncoders(1000,.8);
    sleep(500);
    driveright(1050,.7);
        driveForwardEncoders(1250,.6);
        sleep(700);
        Shooter_Speed = 0.67;
        sleep(10);

        shoot(false,false, true);
        sleep(500);
        shoot(false,false, true);
        indexer.setPosition(0);
        shoot(false,false, true);
        sleep(750);
        shoot(false,false, true);
        indexer.setPosition(0.65);
        shoot(false,false, true);
        sleep(750);
        shoot(false,false, true);
        indexer.setPosition(0);
        shoot(false,false, true);
        sleep(750);
        shoot(false,false, true);
        indexer.setPosition(0.65);
        shoot(false,false, false);
        shoot(false,false, true);
        sleep(500);
        shoot(false,false, true);
        indexer.setPosition(0);
        shoot(false,false, true);
        sleep(750);
        shoot(false,false, true);
        indexer.setPosition(0.65);
        shoot(false,false, true);
        sleep(750);
        shoot(false,false, true);
        indexer.setPosition(0);
        shoot(false,false, true);
        sleep(750);
        shoot(false,false, true);
        indexer.setPosition(0.65);
        shoot(false,false, false);

        driveleft(300,.5);

        driveright(750,1);

        //driveleft(1500,.8);
        driveForwardEncoders(1500,.8);
        driveBackwardEncoders(1500,.8);
        driveleft(750,.4);
        driveForwardEncoders(2900,5);
        driveBackwardEncoders(2900,.5);
        //wobbleClawL.setposition(ungrab);
        //wobbleClawR.setposition(ungrab);
        driveBackwardEncoders(1000,.7);
    }

    public void Zone_C() {
        driveForwardEncoders(1000,.8);
        //wobbleClawL.setposition(grab);
        //wobbleClawR.setposition(grab);
        sleep(500);
        driveright(1050,.7);
        driveForwardEncoders(1250,.6);
        sleep(700);
        Shooter_Speed = 0.67;
        sleep(10);

            shoot(false,false, true);
            sleep(500);
            shoot(false,false, true);
            indexer.setPosition(0);
            shoot(false,false, true);
            sleep(750);
            shoot(false,false, true);
            indexer.setPosition(0.65);
            shoot(false,false, true);
            sleep(750);
            shoot(false,false, true);
            indexer.setPosition(0);
            shoot(false,false, true);
            sleep(750);
            shoot(false,false, true);
            indexer.setPosition(0.65);
            shoot(false,false, false);
            shoot(false,false, true);
            sleep(500);
            shoot(false,false, true);
            indexer.setPosition(0);
            shoot(false,false, true);
            sleep(750);
            shoot(false,false, true);
            indexer.setPosition(0.65);
            shoot(false,false, true);
            sleep(750);
            shoot(false,false, true);
            indexer.setPosition(0);
            shoot(false,false, true);
            sleep(750);
            shoot(false,false, true);
            indexer.setPosition(0.65);
            shoot(false,false, false);


        driveleft(300,.5);
        while (nextstep(0,0,2000)) {
            teledrive(foregoal(0), rightgoal(0),turngoal(2000));
        }
        teledrive(0,0,0);
        driveright(3000,.7);
        driveleft(2900,5);
        //wobbleClawL.setposition(grab);
        //wobbleClawR.setposition(grab);
        driveright(2900,.5);
        //wobbleClawL.setposition(ungrab);
        //wobbleClawR.setposition(ungrab);
        driveBackwardEncoders(1000,1);
        sleep(30000);
    }
}
