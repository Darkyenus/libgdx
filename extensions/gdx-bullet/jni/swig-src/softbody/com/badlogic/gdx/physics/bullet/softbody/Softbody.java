/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.softbody;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class Softbody implements SoftbodyConstants {

	/** Temporary Vector3 instance, used by native methods that return a Vector3 instance */
	public final static Vector3 staticVector3 = new Vector3();
	/** Pool of Vector3, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Vector3> poolVector3 = new com.badlogic.gdx.utils.Pool<Vector3>() {
		@Override
		protected Vector3 newObject() {
			return new Vector3();
		}
	};


	/** Temporary Quaternion instance, used by native methods that return a Quaternion instance */
	public final static Quaternion staticQuaternion = new Quaternion();
	/** Pool of Quaternion, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Quaternion> poolQuaternion = new com.badlogic.gdx.utils.Pool<Quaternion>() {
		@Override
		protected Quaternion newObject() {
			return new Quaternion();
		}
	};


	/** Temporary Matrix3 instance, used by native methods that return a Matrix3 instance */
	public final static Matrix3 staticMatrix3 = new Matrix3();
	/** Pool of Matrix3, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Matrix3> poolMatrix3 = new com.badlogic.gdx.utils.Pool<Matrix3>() {
		@Override
		protected Matrix3 newObject() {
			return new Matrix3();
		}
	};


	/** Temporary Matrix4 instance, used by native methods that return a Matrix4 instance */
	public final static Matrix4 staticMatrix4 = new Matrix4();
	/** Pool of Matrix4, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Matrix4> poolMatrix4 = new com.badlogic.gdx.utils.Pool<Matrix4>() {
		@Override
		protected Matrix4 newObject() {
			return new Matrix4();
		}
	};

  public static Matrix3 Lerp(Matrix3 a, Matrix3 b, float t) {
	return SoftbodyJNI.Lerp(a, b, t);
}

  public static Vector3 Clamp(Vector3 v, float maxlength) {
	return SoftbodyJNI.Clamp(v, maxlength);
}

  public static float ClusterMetric(Vector3 x, Vector3 y) {
    return SoftbodyJNI.ClusterMetric(x, y);
  }

  public static Matrix3 ScaleAlongAxis(Vector3 a, float s) {
	return SoftbodyJNI.ScaleAlongAxis(a, s);
}

  public static Matrix3 Cross(Vector3 v) {
	return SoftbodyJNI.Cross(v);
}

  public static Matrix3 Diagonal(float x) {
	return SoftbodyJNI.Diagonal(x);
}

  public static Matrix3 Add(Matrix3 a, Matrix3 b) {
	return SoftbodyJNI.Add(a, b);
}

  public static Matrix3 Sub(Matrix3 a, Matrix3 b) {
	return SoftbodyJNI.Sub(a, b);
}

  public static Matrix3 Mul(Matrix3 a, float b) {
	return SoftbodyJNI.Mul(a, b);
}

  public static void Orthogonalize(Matrix3 m) {
    SoftbodyJNI.Orthogonalize(m);
  }

  public static Matrix3 MassMatrix(float im, Matrix3 iwi, Vector3 r) {
	return SoftbodyJNI.MassMatrix(im, iwi, r);
}

  public static Matrix3 ImpulseMatrix(float dt, float ima, float imb, Matrix3 iwi, Vector3 r) {
	return SoftbodyJNI.ImpulseMatrix__SWIG_0(dt, ima, imb, iwi, r);
}

  public static Matrix3 ImpulseMatrix(float ima, Matrix3 iia, Vector3 ra, float imb, Matrix3 iib, Vector3 rb) {
	return SoftbodyJNI.ImpulseMatrix__SWIG_1(ima, iia, ra, imb, iib, rb);
}

  public static Matrix3 AngularImpulseMatrix(Matrix3 iia, Matrix3 iib) {
	return SoftbodyJNI.AngularImpulseMatrix(iia, iib);
}

  public static Vector3 ProjectOnAxis(Vector3 v, Vector3 a) {
	return SoftbodyJNI.ProjectOnAxis(v, a);
}

  public static Vector3 ProjectOnPlane(Vector3 v, Vector3 a) {
	return SoftbodyJNI.ProjectOnPlane(v, a);
}

  public static void ProjectOrigin(Vector3 a, Vector3 b, Vector3 prj, SWIGTYPE_p_float sqd) {
    SoftbodyJNI.ProjectOrigin__SWIG_0(a, b, prj, SWIGTYPE_p_float.getCPtr(sqd));
  }

  public static void ProjectOrigin(Vector3 a, Vector3 b, Vector3 c, Vector3 prj, SWIGTYPE_p_float sqd) {
    SoftbodyJNI.ProjectOrigin__SWIG_1(a, b, c, prj, SWIGTYPE_p_float.getCPtr(sqd));
  }

  public static Vector3 BaryCoord(Vector3 a, Vector3 b, Vector3 c, Vector3 p) {
	return SoftbodyJNI.BaryCoord(a, b, c, p);
}

  public static float ImplicitSolve(btSoftBody.ImplicitFn fn, Vector3 a, Vector3 b, float accuracy, int maxiterations) {
    return SoftbodyJNI.ImplicitSolve__SWIG_0(btSoftBody.ImplicitFn.getCPtr(fn), fn, a, b, accuracy, maxiterations);
  }

  public static float ImplicitSolve(btSoftBody.ImplicitFn fn, Vector3 a, Vector3 b, float accuracy) {
    return SoftbodyJNI.ImplicitSolve__SWIG_1(btSoftBody.ImplicitFn.getCPtr(fn), fn, a, b, accuracy);
  }

  public static void EvaluateMedium(btSoftBodyWorldInfo wfi, Vector3 x, btSoftBody.sMedium medium) {
    SoftbodyJNI.EvaluateMedium(btSoftBodyWorldInfo.getCPtr(wfi), wfi, x, btSoftBody.sMedium.getCPtr(medium), medium);
  }

  public static Vector3 NormalizeAny(Vector3 v) {
	return SoftbodyJNI.NormalizeAny(v);
}

  public static btDbvtAabbMm VolumeOf(btSoftBody.Face f, float margin) {
    return new btDbvtAabbMm(SoftbodyJNI.VolumeOf__SWIG_0(btSoftBody.Face.getCPtr(f), f, margin), true);
  }

  public static Vector3 CenterOf(btSoftBody.Face f) {
	return SoftbodyJNI.CenterOf(btSoftBody.Face.getCPtr(f), f);
}

  public static float AreaOf(Vector3 x0, Vector3 x1, Vector3 x2) {
    return SoftbodyJNI.AreaOf(x0, x1, x2);
  }

  public static float VolumeOf(Vector3 x0, Vector3 x1, Vector3 x2, Vector3 x3) {
    return SoftbodyJNI.VolumeOf__SWIG_1(x0, x1, x2, x3);
  }

  public static void ApplyClampedForce(btSoftBody.Node n, Vector3 f, float dt) {
    SoftbodyJNI.ApplyClampedForce(btSoftBody.Node.getCPtr(n), n, f, dt);
  }

  public static int MatchEdge(btSoftBody.Node a, btSoftBody.Node b, btSoftBody.Node ma, btSoftBody.Node mb) {
    return SoftbodyJNI.MatchEdge(btSoftBody.Node.getCPtr(a), a, btSoftBody.Node.getCPtr(b), b, btSoftBody.Node.getCPtr(ma), ma, btSoftBody.Node.getCPtr(mb), mb);
  }

  public static int PolarDecompose(Matrix3 m, Matrix3 q, Matrix3 s) {
    return SoftbodyJNI.PolarDecompose(m, q, s);
  }

}
