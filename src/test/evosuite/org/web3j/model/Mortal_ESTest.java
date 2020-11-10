/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 10 22:05:08 GMT 2020
 */

package org.web3j.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import okhttp3.OkHttpClient;
import org.bouncycastle.math.ec.ECConstants;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.web3j.crypto.Credentials;
import org.web3j.model.Mortal;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.Web3jService;
import org.web3j.protocol.admin.Admin;
import org.web3j.protocol.admin.JsonRpc2_0Admin;
import org.web3j.protocol.core.JsonRpc2_0Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.request.Transaction;
import org.web3j.protocol.http.HttpService;
import org.web3j.protocol.ipc.IpcService;
import org.web3j.protocol.ipc.UnixIpcService;
import org.web3j.tx.ClientTransactionManager;
import org.web3j.tx.ReadonlyTransactionManager;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;
import org.web3j.tx.gas.DefaultGasProvider;
import org.web3j.tx.gas.StaticGasProvider;
import org.web3j.tx.response.NoOpProcessor;
import org.web3j.tx.response.PollingTransactionReceiptProcessor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Mortal_ESTest extends Mortal_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UnixIpcService unixIpcService0 = new UnixIpcService((String) null, true);
      Admin admin0 = Admin.build((Web3jService) unixIpcService0);
      ReadonlyTransactionManager readonlyTransactionManager0 = new ReadonlyTransactionManager(admin0, (String) null);
      BigInteger bigInteger0 = ECConstants.TWO;
      RemoteCall<Mortal> remoteCall0 = Mortal.deploy((Web3j) admin0, (TransactionManager) readonlyTransactionManager0, bigInteger0, (BigInteger) null);
      assertNotNull(remoteCall0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NoOpProcessor noOpProcessor0 = new NoOpProcessor((Web3j) null);
      ClientTransactionManager clientTransactionManager0 = new ClientTransactionManager((Web3j) null, "", noOpProcessor0);
      DefaultGasProvider defaultGasProvider0 = new DefaultGasProvider();
      // Undeclared exception!
      try { 
        Mortal.load("t?spQ~Iuhj1t5{z(", (Web3j) null, (TransactionManager) clientTransactionManager0, (ContractGasProvider) defaultGasProvider0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to determine sync status of node
         //
         verifyException("org.web3j.ens.EnsResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnixIpcService unixIpcService0 = new UnixIpcService((String) null);
      JsonRpc2_0Admin jsonRpc2_0Admin0 = new JsonRpc2_0Admin(unixIpcService0);
      int int0 = 1801;
      PollingTransactionReceiptProcessor pollingTransactionReceiptProcessor0 = new PollingTransactionReceiptProcessor(jsonRpc2_0Admin0, 0L, 1801);
      ClientTransactionManager clientTransactionManager0 = new ClientTransactionManager(jsonRpc2_0Admin0, (String) null, pollingTransactionReceiptProcessor0);
      BigInteger bigInteger0 = BigInteger.ZERO;
      StaticGasProvider staticGasProvider0 = new StaticGasProvider(bigInteger0, bigInteger0);
      // Undeclared exception!
      try { 
        Mortal.load("QCvc%", (Web3j) jsonRpc2_0Admin0, (TransactionManager) clientTransactionManager0, (ContractGasProvider) staticGasProvider0);
        fail("Expecting exception: UnsatisfiedLinkError");
      
      } catch(UnsatisfiedLinkError e) {
         //
         // could not load FFI provider jnr.ffi.provider.jffi.Provider
         //
         verifyException("jnr.ffi.provider.InvalidRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HttpService httpService0 = new HttpService();
      Web3j web3j0 = Web3j.build((Web3jService) httpService0);
      PollingTransactionReceiptProcessor pollingTransactionReceiptProcessor0 = new PollingTransactionReceiptProcessor(web3j0, 0L, 3386);
      ClientTransactionManager clientTransactionManager0 = new ClientTransactionManager(web3j0, "http://localhost:8545/", pollingTransactionReceiptProcessor0);
      BigInteger bigInteger0 = ECConstants.ZERO;
      // Undeclared exception!
      try { 
        Mortal.load("", web3j0, (TransactionManager) clientTransactionManager0, bigInteger0, bigInteger0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to determine sync status of node
         //
         verifyException("org.web3j.ens.EnsResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HttpService httpService0 = new HttpService((String) null, false);
      Web3j web3j0 = Web3j.build((Web3jService) httpService0);
      DefaultGasProvider defaultGasProvider0 = new DefaultGasProvider();
      Mortal mortal0 = null;
      try {
        mortal0 = new Mortal("", web3j0, (TransactionManager) null, defaultGasProvider0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to determine sync status of node
         //
         verifyException("org.web3j.ens.EnsResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsonRpc2_0Web3j jsonRpc2_0Web3j0 = new JsonRpc2_0Web3j((Web3jService) null);
      BigInteger bigInteger0 = ECConstants.FOUR;
      // Undeclared exception!
      try { 
        Mortal.load("6h1$x^zVhy", (Web3j) jsonRpc2_0Web3j0, (Credentials) null, bigInteger0, bigInteger0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.web3j.tx.RawTransactionManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Web3jService web3jService0 = null;
      Admin admin0 = Admin.build((Web3jService) null);
      TransactionManager transactionManager0 = null;
      BigInteger bigInteger0 = Transaction.DEFAULT_GAS;
      Mortal mortal0 = Mortal.load((String) null, (Web3j) admin0, (TransactionManager) null, bigInteger0, bigInteger0);
      assertEquals("608060405234801561001057600080fd5b5060008054600160a060020a0319163317905560bf806100316000396000f300608060405260043610603e5763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166341c0e1b581146043575b600080fd5b348015604e57600080fd5b5060556057565b005b60005473ffffffffffffffffffffffffffffffffffffffff1633141560915760005473ffffffffffffffffffffffffffffffffffffffff16ff5b5600a165627a7a72305820bd83297d6ad833c422a381472ffff6b8d9710d9fd0ab35af165743def89c92090029", mortal0.getContractBinary());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IpcService ipcService0 = new IpcService();
      JsonRpc2_0Admin jsonRpc2_0Admin0 = new JsonRpc2_0Admin(ipcService0);
      BigInteger bigInteger0 = ECConstants.ZERO;
      StaticGasProvider staticGasProvider0 = new StaticGasProvider(bigInteger0, bigInteger0);
      RemoteCall<Mortal> remoteCall0 = Mortal.deploy((Web3j) jsonRpc2_0Admin0, (Credentials) null, (ContractGasProvider) staticGasProvider0);
      assertNotNull(remoteCall0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Credentials credentials0 = null;
      BigInteger bigInteger0 = ECConstants.ONE;
      StaticGasProvider staticGasProvider0 = new StaticGasProvider(bigInteger0, bigInteger0);
      // Undeclared exception!
      try { 
        Mortal.load((String) null, (Web3j) null, (Credentials) null, (ContractGasProvider) staticGasProvider0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.web3j.tx.RawTransactionManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnixIpcService unixIpcService0 = new UnixIpcService("608060405234801561001057600080fd5b5060008054600160a060020a0319163317905560bf806100316000396000f300608060405260043610603e5763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166341c0e1b581146043575b600080fd5b348015604e57600080fd5b5060556057565b005b60005473ffffffffffffffffffffffffffffffffffffffff1633141560915760005473ffffffffffffffffffffffffffffffffffffffff16ff5b5600a165627a7a72305820bd83297d6ad833c422a381472ffff6b8d9710d9fd0ab35af165743def89c92090029");
      int int0 = 0;
      ThreadPoolExecutor.DiscardOldestPolicy threadPoolExecutor_DiscardOldestPolicy0 = new ThreadPoolExecutor.DiscardOldestPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0, threadPoolExecutor_DiscardOldestPolicy0);
      Admin admin0 = Admin.build((Web3jService) unixIpcService0, 3221L, (ScheduledExecutorService) scheduledThreadPoolExecutor0);
      Credentials credentials0 = null;
      BigInteger bigInteger0 = ECConstants.THREE;
      RemoteCall<Mortal> remoteCall0 = Mortal.deploy((Web3j) admin0, credentials0, bigInteger0, bigInteger0);
      assertNotNull(remoteCall0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClientTransactionManager clientTransactionManager0 = new ClientTransactionManager((Web3j) null, "Ko)~C7YbD!aIn:m3", 0, 0);
      StaticGasProvider staticGasProvider0 = new StaticGasProvider((BigInteger) null, (BigInteger) null);
      RemoteCall<Mortal> remoteCall0 = Mortal.deploy((Web3j) null, (TransactionManager) clientTransactionManager0, (ContractGasProvider) staticGasProvider0);
      assertNotNull(remoteCall0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Web3jService web3jService0 = null;
      Admin admin0 = Admin.build((Web3jService) null);
      TransactionManager transactionManager0 = null;
      BigInteger bigInteger0 = Transaction.DEFAULT_GAS;
      StaticGasProvider staticGasProvider0 = new StaticGasProvider(bigInteger0, bigInteger0);
      Mortal.load((String) null, (Web3j) admin0, (TransactionManager) null, (ContractGasProvider) staticGasProvider0);
      Credentials credentials0 = null;
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      HttpService httpService0 = new HttpService(okHttpClient0, true);
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0);
      JsonRpc2_0Web3j jsonRpc2_0Web3j0 = new JsonRpc2_0Web3j(httpService0, 2987L, scheduledThreadPoolExecutor0);
      ClientTransactionManager clientTransactionManager0 = new ClientTransactionManager(jsonRpc2_0Web3j0, "http://localhost:8545/");
      byte[] byteArray0 = new byte[3];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      Mortal mortal0 = null;
      try {
        mortal0 = new Mortal("org.web3j.model.Mortal", jsonRpc2_0Web3j0, clientTransactionManager0, bigInteger0, bigInteger0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to determine sync status of node
         //
         verifyException("org.web3j.ens.EnsResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OkHttpClient okHttpClient0 = new OkHttpClient();
      HttpService httpService0 = new HttpService("kill", okHttpClient0, false);
      Admin admin0 = Admin.build((Web3jService) httpService0);
      BigInteger bigInteger0 = ECConstants.THREE;
      Mortal mortal0 = null;
      try {
        mortal0 = new Mortal("", admin0, (Credentials) null, bigInteger0, bigInteger0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.web3j.tx.RawTransactionManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StaticGasProvider staticGasProvider0 = new StaticGasProvider((BigInteger) null, (BigInteger) null);
      Mortal mortal0 = null;
      try {
        mortal0 = new Mortal("Ko)~C7YbD!aIn:m3", (Web3j) null, (Credentials) null, staticGasProvider0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.web3j.tx.RawTransactionManager", e);
      }
  }
}
