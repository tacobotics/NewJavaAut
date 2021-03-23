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

@Autonomous(name = "java_auto")

public class java_auto extends Taco_Super_class {

    double Shooter_Speed;
    double Rounds;
    double Zone;

    @Override
    public void runOpMode() {
        List<Recognition> recognitions;
        Right_Front = hardwareMap.get(DcMotor.class, "Right_Front");
        Right_Rear = hardwareMap.get(DcMotor.class, "Right_Rear");
        Left_Front = hardwareMap.get(DcMotor.class, "Left_Front");
        Left_Rear = hardwareMap.get(DcMotor.class, "Left_Rear");
        arm = hardwareMap.get(DcMotor.class, "arm");
        shooter = hardwareMap.get(DcMotor.class, "shooter");
        wheels = hardwareMap.get(DcMotor.class, "wheels");
        indexer = hardwareMap.get(Servo.class, "indexer");
        pincher = hardwareMap.get(Servo.class, "pincher");

        initialization(true);

        telemetry.addData(">", "Wait To Start!!!!!!!!!!!!!!!!!!");
        telemetry.update();
        Shooter_Speed = 0.65;
        Right_Front.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Right_Rear.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Left_Front.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Left_Rear.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        arm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        shooter.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        shooter.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        shooter.setDirection(DcMotorSimple.Direction.REVERSE);
        arm.setDirection(DcMotorSimple.Direction.REVERSE);
        wheels.setDirection(DcMotorSimple.Direction.REVERSE);

        }


    public void Zone_A() {
        //wobbleClawL.setposition(grab);
        //wobbleClawR.setposition(grab);
        driveForwardEncoders(1000,1);
        sleep(500);
        driveright(1050,.7);
        driveForwardEncoders(1250,.6);
        sleep(700);
        Shooter_Speed = 0.67;
        sleep(10);
        Shoot2();
        Shoot2();
        driveleft(300,.5);
        while (nextstep(0,0,2000)) {
            teledrive(foregoal(0), rightgoal(0),turngoal(2000));
        }
        teledrive(0,0,0);
        driveright(500,.7);
        //wobbleClawL.setposition(ungrab);
        //wobbleClawR.setposition(ungrab);
        driveleft(3000,.7);
        //wobbleClawL.setposition(grab);
        //wobbleClawR.setposition(grab);
        driveright(2900,.5);
        //wobbleClawL.setposition(ungrab);
        //wobbleClawR.setposition(ungrab);
        driveBackwardEncoders(1000,1);
        sleep(30000);
    }

    public void Zone_B() { }

    public void Zone_C() { }
}
